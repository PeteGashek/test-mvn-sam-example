SET SUBDIR=%~dp0

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