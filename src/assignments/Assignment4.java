package assignments;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String args[]) throws Exception{
        SimpleDateFormat date_format=new SimpleDateFormat("dd-MM-yyyy");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String times[]=new String[n];
        for(int i=0;i<n;i++){
            times[i]=sc.nextLine();
        }

        for(String s:times){
            Date anv_date=date_format.parse(s.split(" ")[0]);
            Date curr_date=date_format.parse(s.split(" ")[1]);
            if(anv_date.compareTo(curr_date)<0){
                Date kyc_date=date_format.parse(s.split(" ")[0].substring(0,5)+s.split(" ")[1].substring(5));
                Calendar c=Calendar.getInstance();
                c.setTime(kyc_date);
                c.add(Calendar.DATE,-30);
                String kyc_start_date=date_format.format(c.getTime());
                c.add(Calendar.DATE,60);
                String kyc_end_date=date_format.format(curr_date.compareTo(c.getTime())<=0 ? curr_date : c.getTime() );
                System.out.println(kyc_start_date+" "+kyc_end_date);
            }else{
                System.out.println("No Range");
            }
        }


    }
}
