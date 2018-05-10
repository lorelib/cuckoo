@echo off
set localdir=%~dp0

echo start install project

call mvn install -f cuckoo-parent\pom.xml
call mvn clean install -f pom.xml -Dmaven.test.skip=true

echo end install