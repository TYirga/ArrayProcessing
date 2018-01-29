package tize.com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArraySum {
    @RequestMapping("/")
    public String ArrayProcessing(@RequestParam("size") int size){
     Integer [] arraySum={4,16,64,128};

        int sum=0;
        double average=0;
      for(int i=0;i<size;i++){

        sum+=arraySum[i];
        average=sum/(arraySum.length);}

        //Find maximum in the Array
          int maxArray=arraySum[0];
      for(int i=1;i<arraySum.length;i++){
          if(arraySum[i]>maxArray)
              maxArray=arraySum[i];
      }

return " Sum=" +sum +"<br/>" + "Average= "+ average + "<br/> Maximum in the array = "+ maxArray;

    }

}
