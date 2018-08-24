;ControlFocus("title","text",controlID) Edit1=Edit instance 1
ControlFocus("打开", "","Edit1")

;"这里选择要加载的文件"

; Wait 10 seconds for the Upload window to appear
  WinWait("[CLASS:#32770]","",10)


; Set the File name text in the Edit field
  ControlSetText("打开", "", "Edit1", "C:\_PersonalInstall\Jenkins\workspace\MyThucydidesReport\src\test\resources\autoItScript\Risk01_EmptyZipFile\PPM_9.50_fi.zip")

;Sleep for 2 seconds
  Sleep(2000)

; Click on the Open button
  ControlClick("打开", "","Button1");