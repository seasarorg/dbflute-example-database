#!/bin/bash

cd `dirname $0`

./mysql/bin/mysqld --defaults-file=./my.cnf
