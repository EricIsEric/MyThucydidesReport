;ControlFocus("title","text",controlID) Edit1=Edit instance 1
ControlFocus("��", "","Edit1")

;"����ѡ��Ҫ���ص��ļ�"

; Wait 10 seconds for the Upload window to appear
  WinWait("[CLASS:#32770]","",10)


; Set the File name text in the Edit field
  ControlSetText("��", "", "Edit1", "C:\_PersonalInstall\Jenkins\workspace\MyThucydidesReport\src\test\resources\autoItScript\Risk01_EmptyZipFile\PPM_9.50_fi.zip")

;Sleep for 2 seconds
  Sleep(2000)

; Click on the Open button
  ControlClick("��", "","Button1");