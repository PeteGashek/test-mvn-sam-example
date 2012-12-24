SET SUBDIR=%~dp0
Set Key1=%1
SHIFT

:CORE1
IF "%Key1%" == [] goto :default
If "%Key1%" == "-dp" goto :depl
If "%Key1%" == "-dt" goto :data
If "%Key1%" == "-zo" goto :zookeeper

:default
IF EXIST "%SUBDIR%\data" RMDIR "%SUBDIR%\data" /s /q

IF EXIST "%SUBDIR%\log" RMDIR "%SUBDIR%\log" /s /q

IF EXIST "%SUBDIR%\instances" RMDIR "%SUBDIR%\instances" /s /q

IF EXIST "%SUBDIR%\repository" RMDIR "%SUBDIR%\repository" /s /q

IF EXIST "%SUBDIR%\lock" del "%SUBDIR%\lock"

IF EXIST "%SUBDIR%\derby.log" del "%SUBDIR%\derby.log"

IF EXIST "%SUBDIR%\zookeeper" RMDIR "%SUBDIR%\zookeeper" /s /q

IF EXIST "%SUBDIR%\system\.timestamps" RMDIR "%SUBDIR%\system\.timestamps" /s /q

IF EXIST "%SUBDIR%\deploy" move /-y "%SUBDIR%\deploy\*.*" "%SUBDIR%\"
pause > nul


:depl
IF EXIST "%SUBDIR%\deploy" move /-y "%SUBDIR%\deploy\*.*" "%SUBDIR%\"
pause > nul

:data
IF EXIST "%SUBDIR%\data" RMDIR "%SUBDIR%\data" /s /q
pause > nul

:zookeeper
IF EXIST "%SUBDIR%\zookeeper" RMDIR "%SUBDIR%\zookeeper" /s /q

pause > nul
