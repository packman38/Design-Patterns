package Adapter;

import java.util.List;

public class ClientDetails {

    private IPhoneList phoneList;
public ClientDetails(IPhoneList phoneList){
    this.phoneList = phoneList;
}

public void PrintPhoneNumbers(){
    List<String> phoneNo = phoneList.GetPhoneList();
    for(String p: phoneNo){
        System.out.println(p);
    }
}

class Main
{
    public static void main(String args[]){
        EmployeeDetails obj = new EmployeeDetails();
        List<String>emps = obj.GetEmployees();
        ClientDetails obj3 = new ClientDetails(new EmployeeToPhoneNo(emps));
        obj3.PrintPhoneNumbers();
    }
}
}
