package tize.com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArraySum {
    @RequestMapping("/")
    public String ArrayProcessing(){
      Integer [] arraySum={4,16,64,128};
        int sum=0;
        double average=0;
      for(int i=0;i<arraySum.length;i++){

        sum+=arraySum[i];
        average=sum/(arraySum.length);
        }

return " Sum=" +sum +"</br/>" + "Average= "+ average;

    }

}
