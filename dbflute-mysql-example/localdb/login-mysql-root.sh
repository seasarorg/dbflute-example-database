#!/bin/bash

cd `dirname $0`

./mysql/bin/mysql --defaults-file=./my.cnf --user=root --default-character-set=utf8
