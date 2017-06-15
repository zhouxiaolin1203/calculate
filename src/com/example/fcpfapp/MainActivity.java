package com.example.fcpfapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView dview;
	private RadioGroup a_rgp;
	private RadioButton button;
	private int actors=4;
	private EditText editText[][]=new EditText[3][4];
	private int huoniao[]={0,0,0,0};
	private EditText editprice;
	private double price=0.5;
	private int tuoniao[]={0,0,0,0};
	private int huxi[]={0,0,0,0};
	double result[]={0,0,0,0};
	private TextView viewresult[]=new TextView[4];
	private Button calculate,clean,exit;
	private MyCalculateOnClickListener myCal=new MyCalculateOnClickListener();
	private MyOnFocusChangListener myOnFocusChangListener=new MyOnFocusChangListener();
	private MyClearOnClickListener myClearOnClickListener=new MyClearOnClickListener();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findObjeck();
		a_rgp.setOnCheckedChangeListener(new MyOncheckChangListener());
		
		calculate.setOnClickListener(myCal);
		setEditFocusListener();
		
		exit.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		clean.setOnClickListener(myClearOnClickListener);
	}

	private void findObjeck() {
		// TODO Auto-generated method stub
		
	}

	private void init()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(editText[i][j].getText().toString().equals(""))
					editText[i][j].setText("0");
			}
		}
		if(editprice.getText().toString().equals(""))
			editprice.setText("0.5");
		try{for(int i=0;i<actors; i++){
			
				huoniao[i]=Integer.parseInt(editText[0][i].getText().toString());
				tuoniao[i]=Integer.parseInt(editText[1][i].getText().toString());
				huxi[i]=Integer.parseInt(editText[2][i].getText().toString());
			}
		
		price=Double.parseDouble(editprice.getText().toString());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClick(View v) {
				
            }
	private void calculate()
	{
		result[0]=result[1]=result[2]=result[3]=0;
		for(int i=0;i<actors;i++)
		{
			for(int j=0; j<actors;j++)
			{
				result[i]+=compare(huxi[i],huxi[j])*(tuoniao[i]+tuoniao[j]);
				result[i]+=(myInt(huxi[i])-myInt(huxi[j]))*(huoniao[i]+1)*(huoniao[j]+1)*price;
			}
		}
	}
	private void view()
	{
		for(int i=0;i<actors;i++){
			viewresult[i].setText(String.valueOf(Math.round(result[i]*10/10.0)));
			
		}
	}
	class MyOncheckChangListener implements RadioGroup.OnCheckedChangeListener{
		
		@Override
		public void onCheckedChanged(RadioGroup group,int checkedId)
		{
			clear();
			boolean tag;
			if(button.getId()==checkedId){
			actors=3;
			tag=false;
		}else
			{
				actors=4;
				tag=true;
			}
			for (int i=0;i<3;i++)
			{
				editText[i][3].setEnabled(tag);
			}
			viewresult[3].setEnabled(tag);
			dview.setEnabled(tag);
		}
	}
	 class MyClearOnClickListener implements View.OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			clear();
		}

	}
	 private void clear(){
		 for(int i =0;i<3;i++){
			 for(int j=0;j<4;j++){
				 editText[i][j].setText("0");
			 }
		 }
		 for (int j=0;j<4;j++)
		 {
			 viewresult[j].setText("0");
		 }
	 }
	 private void setEditFocusListener()
	 {
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<4;j++)
			 {
				 editText[i][j].setOnFocusChangeListener(myOnFocusChangListener);
			 }
		 }
		 editprice.setOnFocusChangeListener(myOnFocusChangListener);
	 }
	 class MyCalculateOnClickListener implements View.OnClickListener {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			init();
			calculate();
			view();
		}
		 
	}
	 private int compare(int x ,int y){
		if(x==y)return 0;
		 return x>y?1:-1;
		}
	 private int myInt(int huxi)
	 {
		 int tag=1,huxi_abs;
		 huxi_abs=Math.abs(huxi);
		 if(huxi<0)tag=-1;
		 if(huxi_abs%10>=5)
			 huxi_abs=(huxi_abs/10+1)*10;
		 else
			 huxi_abs=huxi_abs/10*10;
		 return huxi_abs*tag;
	 }
	  class MyOnFocusChangListener implements View.OnFocusChangeListener{

		@Override
		public void onFocusChange(View v, boolean hanFocus) {
			// TODO Auto-generated method stub
			EditText editText=(EditText)v;
			if(hanFocus)
			{
				editText.setText("");
			}
			else {
				if(editText.getText().toString().equals(""))
				{
					if(editText.getId()==R.id.eidtTextprice)
						editText.setText("0.5");
					else
						editText.setText("0");
					
				}
			}
			
		}
		  
	  }

}
