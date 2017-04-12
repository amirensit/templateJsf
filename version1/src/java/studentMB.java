

import javax.inject.Named;
import javax.enterprise.context.Dependent;


@Named(value = "studentMB")
@Dependent
public class studentMB {

    private String standerd;
    
    public studentMB() {
    }
    public void createStudent()
    {
        
    }
    
    public void updateStudent()
    {
        
    }

    public String getStanderd() {
        return standerd;
    }

    public void setStanderd(String standerd) {
        this.standerd = standerd;
    }
    
    
    
}
