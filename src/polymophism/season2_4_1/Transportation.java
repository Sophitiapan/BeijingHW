package polymophism.season2_4_1;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/19 10:59
 * Description:
 */
public class Transportation {
    private String passengers = "40-500人" ;
    private String workingEnv = "海、陆或空";
    String volume = "大中小";

    public String getPassengers() {
        return passengers;
    }

    public String getWorkingEnv() {
        return workingEnv;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public void setWorkingEnv(String workingEnv) {
        this.workingEnv = workingEnv;
    }


    public void function(){
        System.out.println("交通工具可以运输。");
      }

    public void wheels() {
        System.out.println("交通工具一般都有轮子。");
    }
}
