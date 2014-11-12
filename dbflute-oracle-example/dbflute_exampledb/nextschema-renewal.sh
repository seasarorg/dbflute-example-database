#!/bin/bash

cd `dirname $0`
. _project.sh

echo "/nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
echo "Specify the environment type to use nextschema."
echo "nnnnnnnnnn/"
export DBFLUTE_ENVIRONMENT_TYPE=nextschema

echo "/nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
echo "...Calling the ReplaceSchema task"
echo "nnnnnnnnnn/"
sh $DBFLUTE_HOME/etc/cmd/_df-replace-schema.sh $MY_PROPERTIES_PATH
taskReturnCode=$?

if [ $taskReturnCode -ne 0 ];then
  exit $taskReturnCode;
fi

echo "/nnnnnnnnnnnnnnnnnnnnnnn"
echo "...Calling the JDBC task"
echo "nnnnnnnnnn/"
sh $DBFLUTE_HOME/etc/cmd/_df-jdbc.sh $MY_PROPERTIES_PATH
taskReturnCode=$?

if [ $taskReturnCode -ne 0 ];then
  exit $taskReturnCode;
fi

echo "/nnnnnnnnnnnnnnnnnnnnnnnnnnn"
echo "...Calling the Document task"
echo "nnnnnnnnnn/"
sh $DBFLUTE_HOME/etc/cmd/_df-doc.sh $MY_PROPERTIES_PATH
taskReturnCode=$?

if [ $taskReturnCode -ne 0 ];then
  exit $taskReturnCode;
fi

unset DBFLUTE_ENVIRONMENT_TYPE
