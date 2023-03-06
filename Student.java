// created by team in KL
public class Student {
    // data/attributes
    Name name;
    String kp;
    String address;
    String schoolname;
    float marks[] = new float[5];
    
    // methods or operations
    float calcAvg() {
        float sum = 0;
        float avg = 0;
       
        for(int i = 0; i < 5; i++){
            sum = sum+marks[i];
        }
       
        avg = sum/5;
        return avg;
    }
    
    float calcMin() {
        float min = 999;
        for(int i = 0; i < 5; i++){
            if(marks[i]<min){
                min = marks[i];
            }
        }
        return min;
    }

    void setName(Name thename) {
        name = thename;
    }    
    
    void setMark(float mark, int i) {
        marks[i] = mark;        
    }
    
}