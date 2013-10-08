@echo off

setlocal
%~d0
cd %~p0
call _project.bat

set answer=y

echo /nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
echo ...Calling the ReplaceSchema task
echo nnnnnnnnnn/
call %DBFLUTE_HOME%\etc\cmd\_df-replace-schema.cmd %MY_PROPERTIES_PATH%

if "%pause_at_end%"=="y" (
  pause
)
