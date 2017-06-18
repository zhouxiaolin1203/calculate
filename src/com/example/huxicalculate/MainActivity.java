package com.example.huxicalculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity {

	//按钮（结果，清空，退出）
	private Button result,qingkong,tc;
	//输入框（活鸟，拖鸟，胡息，彩头）
	private EditText addhuoniao,yhuoniao,bhuoniao,dhuoniao,addtuoniao,ytuoniao,btuoniao,dtuoniao,addhuxi,yhuxi,bhuxi,dhuxi,
		caitou;
	//结果
	private TextView addresult,yiresult,binresult,dingresult;
	//输入的彩头
	private double dbcaitou;
	//输入的（活鸟，拖鸟，胡息）
	private int intaddhuoniao,intyhuoniao,intbhuoniao,intdhuoniao,intaddtuoniao,intytuoniao,intbtuoniao,intdtuoniao,intaddhuxi,intyhuxi,intbhuxi,intdhuxi;
   
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //定义按钮
        result = (Button) findViewById(R.id.result);
        qingkong = (Button) findViewById(R.id.qingkong);
        tc = (Button) findViewById(R.id.tc);
        
        //定义活鸟
        addhuoniao = (EditText) findViewById(R.id.addhuoniao);
        yhuoniao = (EditText) findViewById(R.id.yhuoniao);
        bhuoniao = (EditText) findViewById(R.id.bhuoniao);
        dhuoniao = (EditText) findViewById(R.id.dhuoniao);
        
        //定义拖鸟
        addtuoniao = (EditText) findViewById(R.id.addtuoniao);
        ytuoniao = (EditText) findViewById(R.id.ytuoniao);
        btuoniao = (EditText) findViewById(R.id.btuoniao);
        dtuoniao = (EditText) findViewById(R.id.dtuoniao);
        
        //定义胡息
        addhuxi = (EditText) findViewById(R.id.addhuxi);
        yhuxi = (EditText) findViewById(R.id.yhuxi);
        bhuxi = (EditText) findViewById(R.id.bhuxi);
        dhuxi = (EditText) findViewById(R.id.dhuxi);
        
        //定义彩头
        caitou = (EditText) findViewById(R.id.caitou);
        
        //定义结果
        addresult = (TextView) findViewById(R.id.addresult);
        yiresult = (TextView) findViewById(R.id.yiresult);
        binresult = (TextView) findViewById(R.id.binresult);
        dingresult = (TextView) findViewById(R.id.dingresult);
        
        result.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				addresult.setText(null);
				yiresult.setText(null);
				binresult.setText(null);
				dingresult.setText(null);
				//Resout();
				FourPerson();
			}
		});
        
        qingkong.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				addhuoniao.setText(null);
				yhuoniao.setText(null);
				bhuoniao.setText(null);
				dhuoniao.setText(null);
				addtuoniao.setText(null);
				ytuoniao.setText(null);
				btuoniao.setText(null);
				dtuoniao.setText(null);
				addhuxi.setText(null);
				yhuxi.setText(null);
				bhuxi.setText(null);
				dhuxi.setText(null);
				addresult.setText("0");
				yiresult.setText("0");
				binresult.setText("0");
				dingresult.setText("0");
				caitou.setText(null);
			}
		});
        
        tc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
    }
	
	 public double Mathrint(double x){
	        if(x<0){
	            double xd=x-(int)(x);
	            double	tmp=0.0;
	            xd =-xd;
	            if(xd>0.4){
	                tmp=	Math.round(xd);
	            }
	            x=(int)x-tmp;
	        }else{
	            x=	Math.round(x);
	        }
	        return x*10.0;

	    }
	 public void FourPerson() {
	        try {
	            //菜头
	        	dbcaitou = Double.parseDouble(caitou.getText().toString());
	       
	        } catch (Exception e) {
	            e.printStackTrace();
	            dbcaitou = 0;
	        }
	        //积分
	        try {
	        	intaddhuxi = Integer.parseInt(addhuxi.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intaddhuxi = 0;
	        }
	        try {
	        	intyhuxi = Integer.parseInt(yhuxi.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intyhuxi = 0;
	        }
	        try {
	        	intbhuxi = Integer.parseInt(bhuxi.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intbhuxi = 0;
	        }
	        try {
	        	intdhuxi = Integer.parseInt(dhuxi.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intdhuxi = 0;
	        }
	        //活鸟
	        try {
	        	intaddhuoniao = Integer.parseInt(addhuoniao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intaddhuoniao = 0;
	        }
	        try {
	        	intyhuoniao = Integer.parseInt(yhuoniao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intyhuoniao = 0;
	        }
	        try {
	        	intbhuoniao = Integer.parseInt(bhuoniao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intbhuoniao = 0;
	        }
	        try {
	        	intdhuoniao = Integer.parseInt(dhuoniao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intdhuoniao = 0;
	        }
	        //拖鸟
	        try {
	        	intaddtuoniao = Integer.parseInt(addtuoniao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intaddtuoniao = 0;
	        }
	        try {
	        	intytuoniao = Integer.parseInt(ytuoniao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intytuoniao = 0;
	        }
	        try {
	        	intbtuoniao = Integer.parseInt(btuoniao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intbtuoniao = 0;
	        }
	        try {
	        	intdtuoniao = Integer.parseInt(dtuoniao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intdtuoniao = 0;
	        }


	        //拖鸟结果值
	        int[] Rtn = {0,0,0,0};

	        int[] hz = {intaddhuxi, intyhuxi, intbhuxi,intdhuxi};
	        int[] tn = {intaddtuoniao, intytuoniao, intbtuoniao,intdtuoniao};
	        int rs = 0;
	        for (int i = 0; i < tn.length; i++) {
	            for (int j = 0; j < tn.length; j++) {
	                if (i != j) {
	                    if (hz[i] - hz[j] > 0) {
	                        rs += tn[i] + tn[j];
	                    } else if(hz[i] - hz[j]==0){
	                        rs+=0;
	                    }else{
	                        rs += (-tn[i] - tn[j]);
	                    }
	                }
	            }

	            Rtn[i]=rs;
	            rs = 0;
	        }

	        intaddhuxi = (int) Mathrint(intaddhuxi / 10.0);
	        intyhuxi = (int) Mathrint(intyhuxi / 10.0);
	        intbhuxi = (int) Mathrint(intbhuxi / 10.0);
	        intdhuxi = (int) Mathrint(intdhuxi / 10.0);

	        //胡子的重新赋值
	        hz[0] = intaddhuxi;
	        hz[1] = intyhuxi;
	        hz[2] = intbhuxi;
	        hz[3] = intdhuxi;

	        int[] hn = {intaddhuoniao, intyhuoniao, intbhuoniao,intdhuoniao};
	        //活鸟结果值
	        int[] Rhn = {0,0,0,0};
	        rs = 0;
	        for (int i = 0; i < tn.length; i++) {
	            for (int j = 0; j < tn.length; j++) {
	                if (i != j) {
	                    rs += ((hz[i] - hz[j]) * dbcaitou * (hn[i] + 1) * (hn[j] + 1));
	                }

	            }
	            Rhn[i]=rs;
	            rs = 0;
	        }

	        int Srs11=Rhn[0] + Rtn[0];
	        String Srs1 = Integer.toString(Srs11);
	        addresult.setText(Srs1);
	        int Srs22=Rhn[1] + Rtn[1];
	        String Srs2 = Integer.toString(Srs22);
	        yiresult.setText(Srs2);
	        int Srs33=Rhn[2] + Rtn[2];
	        String Srs3 =  Integer.toString(Srs33);
	        binresult.setText(Srs3);
	        int Srs44=Rhn[3] + Rtn[3];
	        String Srs4 =  Integer.toString(Srs44);
	        dingresult.setText(Srs4);
	    }
}
