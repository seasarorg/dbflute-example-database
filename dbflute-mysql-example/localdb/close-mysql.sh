#!/bin/bash

cd `dirname $0`

./mysql/bin/mysqladmin --defaults-file=./my.cnf -u root shutdown -p
