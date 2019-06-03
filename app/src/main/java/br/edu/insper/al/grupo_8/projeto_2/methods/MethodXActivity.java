package br.edu.insper.al.grupo_8.projeto_2.methods;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.TextView;

import br.edu.insper.al.grupo_8.projeto_2.R;

public class MethodXActivity extends AppCompatActivity {

    private int s1, s2, s3, s4, s5,
            s6, s7, s8, s9, s10,
            s11, s12, s13, s14, s15,
            s16, s17, s18, s19, s20,
            s21, s22, s23, s24, s25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_x);

        TextView resultadoSoma = findViewById(R.id.resultadox);

        RadioButton cb0 = findViewById(R.id.radioButtonx00);
        RadioButton cb1 = findViewById(R.id.radioButtonx01);
        RadioButton cb2 = findViewById(R.id.radioButtonx02);
        RadioButton cb3 = findViewById(R.id.radioButtonx03);
        RadioButton cb4 = findViewById(R.id.radioButtonx04);
        RadioButton cb5 = findViewById(R.id.radioButtonx05);
        RadioButton cb6 = findViewById(R.id.radioButtonx06);
        RadioButton cb7 = findViewById(R.id.radioButtonx10);
        RadioButton cb8 = findViewById(R.id.radioButtonx11);
        RadioButton cb9 = findViewById(R.id.radioButtonx12);
        RadioButton cb10 = findViewById(R.id.radioButtonx13);
        RadioButton cb11 = findViewById(R.id.radioButtonx14);
        RadioButton cb12 = findViewById(R.id.radioButtonx15);
        RadioButton cb13 = findViewById(R.id.radioButtonx16);
        RadioButton cb14 = findViewById(R.id.radioButtonx20);
        RadioButton cb15 = findViewById(R.id.radioButtonx21);
        RadioButton cb16 = findViewById(R.id.radioButtonx22);
        RadioButton cb17 = findViewById(R.id.radioButtonx23);
        RadioButton cb18 = findViewById(R.id.radioButtonx24);
        RadioButton cb19 = findViewById(R.id.radioButtonx25);
        RadioButton cb20 = findViewById(R.id.radioButtonx26);
        RadioButton cb21 = findViewById(R.id.radioButtonx30);
        RadioButton cb22 = findViewById(R.id.radioButtonx31);
        RadioButton cb23 = findViewById(R.id.radioButtonx32);
        RadioButton cb24 = findViewById(R.id.radioButtonx33);
        RadioButton cb25 = findViewById(R.id.radioButtonx34);
        RadioButton cb26 = findViewById(R.id.radioButtonx35);
        RadioButton cb27 = findViewById(R.id.radioButtonx36);
        RadioButton cb28 = findViewById(R.id.radioButtonx40);
        RadioButton cb29 = findViewById(R.id.radioButtonx41);
        RadioButton cb30 = findViewById(R.id.radioButtonx42);
        RadioButton cb31 = findViewById(R.id.radioButtonx43);
        RadioButton cb32 = findViewById(R.id.radioButtonx44);
        RadioButton cb33 = findViewById(R.id.radioButtonx45);
        RadioButton cb34 = findViewById(R.id.radioButtonx46);
        RadioButton cb35 = findViewById(R.id.radioButtonx50);
        RadioButton cb36 = findViewById(R.id.radioButtonx51);
        RadioButton cb37 = findViewById(R.id.radioButtonx52);
        RadioButton cb38 = findViewById(R.id.radioButtonx53);
        RadioButton cb39 = findViewById(R.id.radioButtonx54);
        RadioButton cb40 = findViewById(R.id.radioButtonx55);
        RadioButton cb41 = findViewById(R.id.radioButtonx56);
        RadioButton cb42 = findViewById(R.id.radioButtonx60);
        RadioButton cb43 = findViewById(R.id.radioButtonx61);
        RadioButton cb44 = findViewById(R.id.radioButtonx62);
        RadioButton cb45 = findViewById(R.id.radioButtonx63);
        RadioButton cb46 = findViewById(R.id.radioButtonx64);
        RadioButton cb47 = findViewById(R.id.radioButtonx65);
        RadioButton cb48 = findViewById(R.id.radioButtonx66);
        RadioButton cb49 = findViewById(R.id.radioButtonx70);
        RadioButton cb50 = findViewById(R.id.radioButtonx71);
        RadioButton cb51 = findViewById(R.id.radioButtonx72);
        RadioButton cb52 = findViewById(R.id.radioButtonx73);
        RadioButton cb53 = findViewById(R.id.radioButtonx74);
        RadioButton cb54 = findViewById(R.id.radioButtonx75);
        RadioButton cb55 = findViewById(R.id.radioButtonx76);
        RadioButton cb56 = findViewById(R.id.radioButtonx80);
        RadioButton cb57 = findViewById(R.id.radioButtonx81);
        RadioButton cb58 = findViewById(R.id.radioButtonx82);
        RadioButton cb59 = findViewById(R.id.radioButtonx83);
        RadioButton cb60 = findViewById(R.id.radioButtonx84);
        RadioButton cb61 = findViewById(R.id.radioButtonx85);
        RadioButton cb62 = findViewById(R.id.radioButtonx86);
        RadioButton cb63 = findViewById(R.id.radioButtonx90);
        RadioButton cb64 = findViewById(R.id.radioButtonx91);
        RadioButton cb65 = findViewById(R.id.radioButtonx92);
        RadioButton cb66 = findViewById(R.id.radioButtonx93);
        RadioButton cb67 = findViewById(R.id.radioButtonx94);
        RadioButton cb68 = findViewById(R.id.radioButtonx95);
        RadioButton cb69 = findViewById(R.id.radioButtonx96);
        RadioButton cb70 = findViewById(R.id.radioButtonx100);
        RadioButton cb71 = findViewById(R.id.radioButtonx101);
        RadioButton cb72 = findViewById(R.id.radioButtonx102);
        RadioButton cb73 = findViewById(R.id.radioButtonx103);
        RadioButton cb74 = findViewById(R.id.radioButtonx104);
        RadioButton cb75 = findViewById(R.id.radioButtonx105);
        RadioButton cb76 = findViewById(R.id.radioButtonx106);
        RadioButton cb77 = findViewById(R.id.radioButtonx110);
        RadioButton cb78 = findViewById(R.id.radioButtonx111);
        RadioButton cb79 = findViewById(R.id.radioButtonx112);
        RadioButton cb80 = findViewById(R.id.radioButtonx113);
        RadioButton cb81 = findViewById(R.id.radioButtonx114);
        RadioButton cb82 = findViewById(R.id.radioButtonx115);
        RadioButton cb83 = findViewById(R.id.radioButtonx116);
        RadioButton cb84 = findViewById(R.id.radioButtonx120);
        RadioButton cb85 = findViewById(R.id.radioButtonx121);
        RadioButton cb86 = findViewById(R.id.radioButtonx122);
        RadioButton cb87 = findViewById(R.id.radioButtonx123);
        RadioButton cb88 = findViewById(R.id.radioButtonx124);
        RadioButton cb89 = findViewById(R.id.radioButtonx125);
        RadioButton cb90 = findViewById(R.id.radioButtonx126);
        RadioButton cb91 = findViewById(R.id.radioButtonx130);
        RadioButton cb92 = findViewById(R.id.radioButtonx131);
        RadioButton cb93 = findViewById(R.id.radioButtonx132);
        RadioButton cb94 = findViewById(R.id.radioButtonx133);
        RadioButton cb95 = findViewById(R.id.radioButtonx134);
        RadioButton cb96 = findViewById(R.id.radioButtonx135);
        RadioButton cb97 = findViewById(R.id.radioButtonx136);
        RadioButton cb98 = findViewById(R.id.radioButtonx140);
        RadioButton cb99 = findViewById(R.id.radioButtonx141);
        RadioButton cb100 = findViewById(R.id.radioButtonx142);
        RadioButton cb101 = findViewById(R.id.radioButtonx143);
        RadioButton cb102 = findViewById(R.id.radioButtonx144);
        RadioButton cb103 = findViewById(R.id.radioButtonx145);
        RadioButton cb104 = findViewById(R.id.radioButtonx146);
        RadioButton cb105 = findViewById(R.id.radioButtonx150);
        RadioButton cb106 = findViewById(R.id.radioButtonx151);
        RadioButton cb107 = findViewById(R.id.radioButtonx152);
        RadioButton cb108 = findViewById(R.id.radioButtonx153);
        RadioButton cb109 = findViewById(R.id.radioButtonx154);
        RadioButton cb110 = findViewById(R.id.radioButtonx155);
        RadioButton cb111 = findViewById(R.id.radioButtonx156);
        RadioButton cb112 = findViewById(R.id.radioButtonx160);
        RadioButton cb113 = findViewById(R.id.radioButtonx161);
        RadioButton cb114 = findViewById(R.id.radioButtonx162);
        RadioButton cb115 = findViewById(R.id.radioButtonx163);
        RadioButton cb116 = findViewById(R.id.radioButtonx164);
        RadioButton cb117 = findViewById(R.id.radioButtonx165);
        RadioButton cb118 = findViewById(R.id.radioButtonx166);
        RadioButton cb119 = findViewById(R.id.radioButtonx170);
        RadioButton cb120 = findViewById(R.id.radioButtonx171);
        RadioButton cb121 = findViewById(R.id.radioButtonx172);
        RadioButton cb122 = findViewById(R.id.radioButtonx173);
        RadioButton cb123 = findViewById(R.id.radioButtonx174);
        RadioButton cb124 = findViewById(R.id.radioButtonx175);
        RadioButton cb125 = findViewById(R.id.radioButtonx176);
        RadioButton cb126 = findViewById(R.id.radioButtonx180);
        RadioButton cb127 = findViewById(R.id.radioButtonx181);
        RadioButton cb128 = findViewById(R.id.radioButtonx182);
        RadioButton cb129 = findViewById(R.id.radioButtonx183);
        RadioButton cb130 = findViewById(R.id.radioButtonx184);
        RadioButton cb131 = findViewById(R.id.radioButtonx185);
        RadioButton cb132 = findViewById(R.id.radioButtonx186);
        RadioButton cb133 = findViewById(R.id.radioButtonx190);
        RadioButton cb134 = findViewById(R.id.radioButtonx191);
        RadioButton cb135 = findViewById(R.id.radioButtonx192);
        RadioButton cb136 = findViewById(R.id.radioButtonx193);
        RadioButton cb137 = findViewById(R.id.radioButtonx194);
        RadioButton cb138 = findViewById(R.id.radioButtonx195);
        RadioButton cb139 = findViewById(R.id.radioButtonx196);
        RadioButton cb140 = findViewById(R.id.radioButtonx200);
        RadioButton cb141 = findViewById(R.id.radioButtonx201);
        RadioButton cb142 = findViewById(R.id.radioButtonx202);
        RadioButton cb143 = findViewById(R.id.radioButtonx203);
        RadioButton cb144 = findViewById(R.id.radioButtonx204);
        RadioButton cb145 = findViewById(R.id.radioButtonx205);
        RadioButton cb146 = findViewById(R.id.radioButtonx206);
        RadioButton cb147 = findViewById(R.id.radioButtonx210);
        RadioButton cb148 = findViewById(R.id.radioButtonx211);
        RadioButton cb149 = findViewById(R.id.radioButtonx212);
        RadioButton cb150 = findViewById(R.id.radioButtonx213);
        RadioButton cb151 = findViewById(R.id.radioButtonx214);
        RadioButton cb152 = findViewById(R.id.radioButtonx215);
        RadioButton cb153 = findViewById(R.id.radioButtonx216);
        RadioButton cb154 = findViewById(R.id.radioButtonx220);
        RadioButton cb155 = findViewById(R.id.radioButtonx221);
        RadioButton cb156 = findViewById(R.id.radioButtonx222);
        RadioButton cb157 = findViewById(R.id.radioButtonx223);
        RadioButton cb158 = findViewById(R.id.radioButtonx224);
        RadioButton cb159 = findViewById(R.id.radioButtonx225);
        RadioButton cb160 = findViewById(R.id.radioButtonx226);
        RadioButton cb161 = findViewById(R.id.radioButtonx230);
        RadioButton cb162 = findViewById(R.id.radioButtonx231);
        RadioButton cb163 = findViewById(R.id.radioButtonx232);
        RadioButton cb164 = findViewById(R.id.radioButtonx233);
        RadioButton cb165 = findViewById(R.id.radioButtonx234);
        RadioButton cb166 = findViewById(R.id.radioButtonx235);
        RadioButton cb167 = findViewById(R.id.radioButtonx236);
        RadioButton cb168 = findViewById(R.id.radioButtonx240);
        RadioButton cb169 = findViewById(R.id.radioButtonx241);
        RadioButton cb170 = findViewById(R.id.radioButtonx242);
        RadioButton cb171 = findViewById(R.id.radioButtonx243);
        RadioButton cb172 = findViewById(R.id.radioButtonx244);
        RadioButton cb173 = findViewById(R.id.radioButtonx245);
        RadioButton cb174 = findViewById(R.id.radioButtonx246);

        cb0.setOnClickListener(v ->{
            if (cb0.isChecked()){
                s1 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb1.setOnClickListener(v ->{
            if (cb1.isChecked()){
                s1 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb2.setOnClickListener(v ->{
            if (cb2.isChecked()){
                s1 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb3.setOnClickListener(v ->{
            if (cb3.isChecked()){
                s1 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb4.setOnClickListener(v ->{
            if (cb4.isChecked()){
                s1 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb5.setOnClickListener(v ->{
            if (cb5.isChecked()){
                s1 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb6.setOnClickListener(v ->{
            if (cb6.isChecked()){
                s1 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb7.setOnClickListener(v ->{
            if (cb7.isChecked()){
                s2 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb8.setOnClickListener(v ->{
            if (cb8.isChecked()){
                s2 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb9.setOnClickListener(v ->{
            if (cb9.isChecked()){
                s2 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb10.setOnClickListener(v ->{
            if (cb10.isChecked()){
                s2 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb11.setOnClickListener(v ->{
            if (cb11.isChecked()){
                s2 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb12.setOnClickListener(v ->{
            if (cb12.isChecked()){
                s2 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb13.setOnClickListener(v ->{
            if (cb13.isChecked()){
                s2 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb14.setOnClickListener(v ->{
            if (cb14.isChecked()){
                s3 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb15.setOnClickListener(v ->{
            if (cb15.isChecked()){
                s3 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb16.setOnClickListener(v ->{
            if (cb16.isChecked()){
                s3 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb17.setOnClickListener(v ->{
            if (cb17.isChecked()){
                s3 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb18.setOnClickListener(v ->{
            if (cb18.isChecked()){
                s3 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb19.setOnClickListener(v ->{
            if (cb19.isChecked()){
                s3 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb20.setOnClickListener(v ->{
            if (cb20.isChecked()){
                s3 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb21.setOnClickListener(v ->{
            if (cb21.isChecked()){
                s4 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb22.setOnClickListener(v ->{
            if (cb22.isChecked()){
                s4 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb23.setOnClickListener(v ->{
            if (cb23.isChecked()){
                s4 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb24.setOnClickListener(v ->{
            if (cb24.isChecked()){
                s4 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb25.setOnClickListener(v ->{
            if (cb25.isChecked()){
                s4 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb26.setOnClickListener(v ->{
            if (cb26.isChecked()){
                s4 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb27.setOnClickListener(v ->{
            if (cb27.isChecked()){
                s4 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb28.setOnClickListener(v ->{
            if (cb28.isChecked()){
                s5 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb29.setOnClickListener(v ->{
            if (cb29.isChecked()){
                s5 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb30.setOnClickListener(v ->{
            if (cb30.isChecked()){
                s5 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb31.setOnClickListener(v ->{
            if (cb31.isChecked()){
                s5 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb32.setOnClickListener(v ->{
            if (cb32.isChecked()){
                s5 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb33.setOnClickListener(v ->{
            if (cb33.isChecked()){
                s5 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb34.setOnClickListener(v ->{
            if (cb34.isChecked()){
                s5 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb35.setOnClickListener(v ->{
            if (cb35.isChecked()){
                s6 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb36.setOnClickListener(v ->{
            if (cb36.isChecked()){
                s6 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb37.setOnClickListener(v ->{
            if (cb37.isChecked()){
                s6 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb38.setOnClickListener(v ->{
            if (cb38.isChecked()){
                s6 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb39.setOnClickListener(v ->{
            if (cb39.isChecked()){
                s6 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb40.setOnClickListener(v ->{
            if (cb40.isChecked()){
                s6 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb41.setOnClickListener(v ->{
            if (cb41.isChecked()){
                s6 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb42.setOnClickListener(v ->{
            if (cb42.isChecked()){
                s7 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb43.setOnClickListener(v ->{
            if (cb43.isChecked()){
                s7 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb44.setOnClickListener(v ->{
            if (cb44.isChecked()){
                s7 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb45.setOnClickListener(v ->{
            if (cb45.isChecked()){
                s7 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb46.setOnClickListener(v ->{
            if (cb46.isChecked()){
                s7 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb47.setOnClickListener(v ->{
            if (cb47.isChecked()){
                s7 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb48.setOnClickListener(v ->{
            if (cb48.isChecked()){
                s7 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb49.setOnClickListener(v ->{
            if (cb49.isChecked()){
                s8 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb50.setOnClickListener(v ->{
            if (cb50.isChecked()){
                s8 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb51.setOnClickListener(v ->{
            if (cb51.isChecked()){
                s8 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb52.setOnClickListener(v ->{
            if (cb52.isChecked()){
                s8 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb53.setOnClickListener(v ->{
            if (cb53.isChecked()){
                s8 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb54.setOnClickListener(v ->{
            if (cb54.isChecked()){
                s8 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb55.setOnClickListener(v ->{
            if (cb55.isChecked()){
                s8 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb56.setOnClickListener(v ->{
            if (cb56.isChecked()){
                s9 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb57.setOnClickListener(v ->{
            if (cb57.isChecked()){
                s9 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb58.setOnClickListener(v ->{
            if (cb58.isChecked()){
                s9 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb59.setOnClickListener(v ->{
            if (cb59.isChecked()){
                s9 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb60.setOnClickListener(v ->{
            if (cb60.isChecked()){
                s9 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb61.setOnClickListener(v ->{
            if (cb61.isChecked()){
                s9 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb62.setOnClickListener(v ->{
            if (cb62.isChecked()){
                s9 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb63.setOnClickListener(v ->{
            if (cb63.isChecked()){
                s10 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb64.setOnClickListener(v ->{
            if (cb64.isChecked()){
                s10 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb65.setOnClickListener(v ->{
            if (cb65.isChecked()){
                s10 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb66.setOnClickListener(v ->{
            if (cb66.isChecked()){
                s10 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb67.setOnClickListener(v ->{
            if (cb67.isChecked()){
                s10 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb68.setOnClickListener(v ->{
            if (cb68.isChecked()){
                s10 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb69.setOnClickListener(v ->{
            if (cb69.isChecked()){
                s10 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb70.setOnClickListener(v ->{
            if (cb70.isChecked()){
                s11 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb71.setOnClickListener(v ->{
            if (cb71.isChecked()){
                s11 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb72.setOnClickListener(v ->{
            if (cb72.isChecked()){
                s11 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb73.setOnClickListener(v ->{
            if (cb73.isChecked()){
                s11 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb74.setOnClickListener(v ->{
            if (cb74.isChecked()){
                s11 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb75.setOnClickListener(v ->{
            if (cb75.isChecked()){
                s11 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb76.setOnClickListener(v ->{
            if (cb76.isChecked()){
                s11 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb77.setOnClickListener(v ->{
            if (cb77.isChecked()){
                s12 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb78.setOnClickListener(v ->{
            if (cb78.isChecked()){
                s12 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb79.setOnClickListener(v ->{
            if (cb79.isChecked()){
                s12 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb80.setOnClickListener(v ->{
            if (cb80.isChecked()){
                s12 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb81.setOnClickListener(v ->{
            if (cb81.isChecked()){
                s12 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb82.setOnClickListener(v ->{
            if (cb82.isChecked()){
                s12 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb83.setOnClickListener(v ->{
            if (cb83.isChecked()){
                s12 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb84.setOnClickListener(v ->{
            if (cb84.isChecked()){
                s13 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb85.setOnClickListener(v ->{
            if (cb85.isChecked()){
                s13 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb86.setOnClickListener(v ->{
            if (cb86.isChecked()){
                s13 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb87.setOnClickListener(v ->{
            if (cb87.isChecked()){
                s13 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb88.setOnClickListener(v ->{
            if (cb88.isChecked()){
                s13 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb89.setOnClickListener(v ->{
            if (cb89.isChecked()){
                s13 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb90.setOnClickListener(v ->{
            if (cb90.isChecked()){
                s13 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb91.setOnClickListener(v ->{
            if (cb91.isChecked()){
                s14 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb92.setOnClickListener(v ->{
            if (cb92.isChecked()){
                s14 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb93.setOnClickListener(v ->{
            if (cb93.isChecked()){
                s14 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb94.setOnClickListener(v ->{
            if (cb94.isChecked()){
                s14 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb95.setOnClickListener(v ->{
            if (cb95.isChecked()){
                s14 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb96.setOnClickListener(v ->{
            if (cb96.isChecked()){
                s14 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb97.setOnClickListener(v ->{
            if (cb97.isChecked()){
                s14 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb98.setOnClickListener(v ->{
            if (cb98.isChecked()){
                s15 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb99.setOnClickListener(v ->{
            if (cb99.isChecked()){
                s15 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb100.setOnClickListener(v ->{
            if (cb100.isChecked()){
                s15 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb101.setOnClickListener(v ->{
            if (cb101.isChecked()){
                s15 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb102.setOnClickListener(v ->{
            if (cb102.isChecked()){
                s15 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb103.setOnClickListener(v ->{
            if (cb103.isChecked()){
                s15 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb104.setOnClickListener(v ->{
            if (cb104.isChecked()){
                s15 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb105.setOnClickListener(v ->{
            if (cb105.isChecked()){
                s16 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb106.setOnClickListener(v ->{
            if (cb106.isChecked()){
                s16 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb107.setOnClickListener(v ->{
            if (cb107.isChecked()){
                s16 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb108.setOnClickListener(v ->{
            if (cb108.isChecked()){
                s16 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb109.setOnClickListener(v ->{
            if (cb109.isChecked()){
                s16 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb110.setOnClickListener(v ->{
            if (cb110.isChecked()){
                s16 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb111.setOnClickListener(v ->{
            if (cb111.isChecked()){
                s16 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb112.setOnClickListener(v ->{
            if (cb112.isChecked()){
                s17 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb113.setOnClickListener(v ->{
            if (cb113.isChecked()){
                s17 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb114.setOnClickListener(v ->{
            if (cb114.isChecked()){
                s17 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb115.setOnClickListener(v ->{
            if (cb115.isChecked()){
                s17 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb116.setOnClickListener(v ->{
            if (cb116.isChecked()){
                s17 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb117.setOnClickListener(v ->{
            if (cb117.isChecked()){
                s17 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb118.setOnClickListener(v ->{
            if (cb118.isChecked()){
                s17 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb119.setOnClickListener(v ->{
            if (cb119.isChecked()){
                s18 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb120.setOnClickListener(v ->{
            if (cb120.isChecked()){
                s18 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb121.setOnClickListener(v ->{
            if (cb121.isChecked()){
                s18 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb122.setOnClickListener(v ->{
            if (cb122.isChecked()){
                s18 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb123.setOnClickListener(v ->{
            if (cb123.isChecked()){
                s18 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb124.setOnClickListener(v ->{
            if (cb124.isChecked()){
                s18 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb125.setOnClickListener(v ->{
            if (cb125.isChecked()){
                s18 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb126.setOnClickListener(v ->{
            if (cb126.isChecked()){
                s19 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb127.setOnClickListener(v ->{
            if (cb127.isChecked()){
                s19 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb128.setOnClickListener(v ->{
            if (cb128.isChecked()){
                s19 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb129.setOnClickListener(v ->{
            if (cb129.isChecked()){
                s19 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb130.setOnClickListener(v ->{
            if (cb130.isChecked()){
                s19 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb131.setOnClickListener(v ->{
            if (cb131.isChecked()){
                s19 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb132.setOnClickListener(v ->{
            if (cb132.isChecked()){
                s19 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb133.setOnClickListener(v ->{
            if (cb133.isChecked()){
                s20 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb134.setOnClickListener(v ->{
            if (cb134.isChecked()){
                s20 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb135.setOnClickListener(v ->{
            if (cb135.isChecked()){
                s20 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb136.setOnClickListener(v ->{
            if (cb136.isChecked()){
                s20 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb137.setOnClickListener(v ->{
            if (cb137.isChecked()){
                s20 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb138.setOnClickListener(v ->{
            if (cb138.isChecked()){
                s20 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb139.setOnClickListener(v ->{
            if (cb139.isChecked()){
                s20 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb140.setOnClickListener(v ->{
            if (cb140.isChecked()){
                s21 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb141.setOnClickListener(v ->{
            if (cb141.isChecked()){
                s21 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb142.setOnClickListener(v ->{
            if (cb142.isChecked()){
                s21 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb143.setOnClickListener(v ->{
            if (cb143.isChecked()){
                s21 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb144.setOnClickListener(v ->{
            if (cb144.isChecked()){
                s21 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb145.setOnClickListener(v ->{
            if (cb145.isChecked()){
                s21 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb146.setOnClickListener(v ->{
            if (cb146.isChecked()){
                s21 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb147.setOnClickListener(v ->{
            if (cb147.isChecked()){
                s22 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb148.setOnClickListener(v ->{
            if (cb148.isChecked()){
                s22 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb149.setOnClickListener(v ->{
            if (cb149.isChecked()){
                s22 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb150.setOnClickListener(v ->{
            if (cb150.isChecked()){
                s22 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb151.setOnClickListener(v ->{
            if (cb151.isChecked()){
                s22 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb152.setOnClickListener(v ->{
            if (cb152.isChecked()){
                s22 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb153.setOnClickListener(v ->{
            if (cb153.isChecked()){
                s22 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb154.setOnClickListener(v ->{
            if (cb154.isChecked()){
                s23 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb155.setOnClickListener(v ->{
            if (cb155.isChecked()){
                s23 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb156.setOnClickListener(v ->{
            if (cb156.isChecked()){
                s23 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb157.setOnClickListener(v ->{
            if (cb157.isChecked()){
                s23 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb158.setOnClickListener(v ->{
            if (cb158.isChecked()){
                s23 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb159.setOnClickListener(v ->{
            if (cb159.isChecked()){
                s23 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb160.setOnClickListener(v ->{
            if (cb160.isChecked()){
                s23 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb161.setOnClickListener(v ->{
            if (cb161.isChecked()){
                s24 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb162.setOnClickListener(v ->{
            if (cb162.isChecked()){
                s24 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb163.setOnClickListener(v ->{
            if (cb163.isChecked()){
                s24 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb164.setOnClickListener(v ->{
            if (cb164.isChecked()){
                s24 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb165.setOnClickListener(v ->{
            if (cb165.isChecked()){
                s24 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb166.setOnClickListener(v ->{
            if (cb166.isChecked()){
                s24 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb167.setOnClickListener(v ->{
            if (cb167.isChecked()){
                s24 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb168.setOnClickListener(v ->{
            if (cb168.isChecked()){
                s25 = 1;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb169.setOnClickListener(v ->{
            if (cb169.isChecked()){
                s25 = 2;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb170.setOnClickListener(v ->{
            if (cb170.isChecked()){
                s25 = 3;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb171.setOnClickListener(v ->{
            if (cb171.isChecked()){
                s25 = 4;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb172.setOnClickListener(v ->{
            if (cb172.isChecked()){
                s25 = 5;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb173.setOnClickListener(v ->{
            if (cb173.isChecked()){
                s25 = 6;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });cb174.setOnClickListener(v ->{
            if (cb174.isChecked()){
                s25 = 7;
            }
            resultadoSoma.setText(String.valueOf(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19 + s20 + s21 + s22 + s23 + s24 + s25));
        });
    }
}
