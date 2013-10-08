#!/bin/bash

cd `dirname $0`

./mysql/bin/mysql --defaults-file=./my.cnf --user=root --host=localhost --port=43306 --database=mysql --default-character-set=utf8
