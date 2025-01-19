package Basics.CollectionFramework;

class Data {
    public  Integer num;
    public  String name;
    public  InteralData interalData;
    Data (Integer _num , String _name , Integer _revenue) {
        this.num = _num;
        this.name = _name;
        this.interalData = new InteralData(_revenue);
    }

    public  void setNum (Integer _num) {
        this.num = _num;
    }

    public  void setNum (String _name) {
        this.name = _name;
    }

    public Integer  getNum () {
        return num;
    }

    public  String getName () {
        return  name;
    }
}

class InteralData {
    public Integer revenue;

    InteralData (Integer _revenue) {
        this.revenue = _revenue;
    }
}

public class CustomClasses {
    public static void main(String[] args) {
        Data dataObj = new Data(1000 , "Ashish Srivastava" , 6000);
//        Data dataObj1 = new Data(100 , "Ash");
        System.out.println(dataObj.num);
        dataObj.setNum(200);
        dataObj.setNum(4000);
        System.out.println(dataObj.interalData.revenue);
        System.out.println(dataObj.num);

        dataObj.interalData.revenue = 12090;
        System.out.println(dataObj.interalData.revenue);
    }
}
