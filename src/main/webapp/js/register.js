function getFocus()  //�����û����ı����ȡ����
{
    document.getElementById("txtuname").focus();
}
 
function checkname()  //����û���
{
    var myname=document.getElementById("txtuname").value;
    var myDivname=document.getElementById("uname");
    if(myname=="")
    {
        myDivname.innerHTML="<font color='red'>�û�������Ϊ��!</font>";
        return false;
    }
    for(var i=0;i<myname.length;i++)
    {
        var text=myname.charAt(i);
        if(!(text<=9&&text>=0)&&!(text>='a'&&text<='z')&&!(text>='A'&&text<='Z')&&text!="_")
        {
         myDivname.innerHTML="<font color='red'>�û���ֻ�������֡���ĸ���»�����ɣ�</font>";
         break;
        }
    }
    if(i>=myname.length)
    {
        myDivname.innerHTML="<font color='red'>��</font>";
        return true;
    }
}
 
function checkuserpassword()  //������� 
{
 var mypassword=document.getElementById("txtuserpassword").value;
 var myDivpassword=document.getElementById("userpassword");
 if(mypassword=="")
 {
  myDivpassword.innerHTML="<font color='red'>���벻��Ϊ��!</font>";
  return false;
 }
 else if(mypassword.length<6)
 {
  myDivpassword.innerHTML="<font color='red'>��������ӦΪ��λ!</font>";
  return false;
 }
 else
 {
  myDivpassword.innerHTML="<font color='red'>��</font>";
  return true;
 } 
}
 
function checkpwdagin()  //���ȷ������
{
 var myispassword=document.getElementById("txtpwdagin").value;
 var myDivispassword=document.getElementById("pwdagin");
 if(myispassword=="")
 {
     myDivispassword.innerHTML="<font color='red'>ȷ�����벻��Ϊ��!</font>";
     return false;
 }
 else if(document.getElementById("txtuserpassword").value!=document.getElementById("txtpwdagin").value)
 {
  myDivispassword.innerHTML="<font color='red'>ȷ�����������벻һ��!</font>";
  return false;
 } 
 else
 {
  myDivispassword.innerHTML="<font color='red'>��</font>";
  return true;
 } 
}
 
function checktelephone()  //���绰����
{
 var mytelephone=document.getElementById("txttelephone").value;
 var myDivtelephone=document.getElementById("telephone");
 if(mytelephone!="")
 {
     var reg = /^[0-9]{11}$/i;
     if(!reg.test(mytelephone))
        {
            myDivtelephone.innerHTML="<font color='red'>ֻ������11λ���֣�����13595144582��08514785214</font>";
            return false;
        }
     else
     {
      myDivtelephone.innerHTML="<font color='red'>��</font>";
      return true;
     }
 }
 else
 {
     myDivtelephone.innerHTML="<font color='red'>��</font>";
     return true;
 }
}
 
function checkemail()  //���E-mail
{
 var myemail=document.getElementById("txtemail").value;
 var myDivemail=document.getElementById("email");
 if(myemail!="")
 {
     if(myemail.indexOf("@")==-1||myemail.indexOf(".")==-1||(myemail.indexOf("@")>myemail.indexOf(".")))
     {
      myDivemail.innerHTML="<font color='red'>E-mail��ʽ����ȷ������jiie@163.com</font>";
      return false;
     } 
     else
     {
      myDivemail.innerHTML="<font color='red'>��</font>";
      return true;
     }
 }
 else
 {
     myDivemail.innerHTML="<font color='red'>��</font>";
     return true;
 }
}
 
function checkall()  //�������
{
    if(checkname()&&checkuserpassword()&&checkpwdagin()&&checktelephone()&&checkemail()&&checkqq())
    {
        return true;
    }
    return false;
}
 
//��ѡ���ѡ������ǰ�ť��״̬
function checkcjkx()
{
    var a=document.form1.btnregister;
    if(a==null)
    {
        return
    }
    if(document.form1.ckbxcjkx!=null)
    {
        if(document.form1.ckbxcjkx.checked)
        {
            a.disabled=false;
            return
        }
        else
        {
            a.disabled=true;
            return
        }
    }
    else
    {
        a.disabled=true;
        return
    }
}