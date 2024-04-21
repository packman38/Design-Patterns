package Adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeToPhoneNo implements IPhoneList {
    private List<String> Employees;
    public EmployeeToPhoneNo(List<String> Employees){
       this.Employees = Employees;
    }
    @Override
    public List<String> GetPhoneList() {
        List<String> phoneNo = new ArrayList<>();
      for(String s: this.Employees){
          String[]data = s.split("-");
          phoneNo.add(data[3]);
      }
      return phoneNo;
    }
}
