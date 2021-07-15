package com.example.hangie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class quick extends AppCompatActivity {
    TextView text, a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    ArrayList<String> words=new ArrayList<String>();
    ArrayList<Integer> order=new ArrayList<Integer>();
    int lives;
    Random random=new Random();
    int rand;
    int level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick);
        a=findViewById(R.id.A);
        b=findViewById(R.id.B);
        c=findViewById(R.id.C);
        d=findViewById(R.id.D);
        e=findViewById(R.id.E);
        f=findViewById(R.id.F);
        g=findViewById(R.id.G);
        h=findViewById(R.id.H);
        i=findViewById(R.id.I);
        j=findViewById(R.id.J);
        k=findViewById(R.id.K);
        l=findViewById(R.id.L);
        m=findViewById(R.id.M);
        n=findViewById(R.id.N);
        o=findViewById(R.id.O);
        p=findViewById(R.id.P);
        q=findViewById(R.id.Q);
        r=findViewById(R.id.R);
        s=findViewById(R.id.S);
        t=findViewById(R.id.T);
        u=findViewById(R.id.U);
        v=findViewById(R.id.V);
        w=findViewById(R.id.W);
        x=findViewById(R.id.X);
        y=findViewById(R.id.Y);
        z=findViewById(R.id.Z);
        text=findViewById(R.id.text);

        words.add("INTERSTELLAR");
        words.add("PREDESTINATION");
        words.add("THE HANGOVER");
        words.add("GODFATHER");
        words.add("TITANIC");
        words.add("ALADDIN");
        words.add("INCEPTION");
        words.add("JOHNNY ENGLISH");
        words.add("ANABELLE");
        words.add("INCIDIOUS");
        words.add("TERMINATOR");
        words.add("LIFE OF PI");
        words.add("SHUTTER ISLAND");
        words.add("THE DARK KNIGHT");
        words.add("FINDING NEMO");
        words.add("JUMANJI");
        words.add("THE PRESTIGE");
        words.add("HOME ALONE");
        words.add("SHERLOCK HOLMES");
        words.add("JURASSIC PARK");

        for(int i=0; i<20; i++)
            order.add(i);

        rand=random.nextInt(order.size());
        level=order.get(rand);
        order.remove(order.indexOf(rand));



        a.setOnClickListener(v -> keyboard("A"));
        b.setOnClickListener(v -> keyboard("B"));
        c.setOnClickListener(v -> keyboard("C"));
        d.setOnClickListener(v -> keyboard("D"));
        e.setOnClickListener(v -> keyboard("E"));
        f.setOnClickListener(v -> keyboard("F"));
        g.setOnClickListener(v -> keyboard("G"));
        h.setOnClickListener(v -> keyboard("H"));
        i.setOnClickListener(v -> keyboard("I"));
        j.setOnClickListener(v -> keyboard("J"));
        k.setOnClickListener(v -> keyboard("K"));
        l.setOnClickListener(v -> keyboard("L"));
        m.setOnClickListener(v -> keyboard("M"));
        n.setOnClickListener(v -> keyboard("N"));
        o.setOnClickListener(v -> keyboard("O"));
        p.setOnClickListener(v -> keyboard("P"));
        q.setOnClickListener(v -> keyboard("Q"));
        r.setOnClickListener(v -> keyboard("R"));
        s.setOnClickListener(v -> keyboard("S"));
        t.setOnClickListener(v -> keyboard("T"));
        u.setOnClickListener(v -> keyboard("U"));
        v.setOnClickListener(v -> keyboard("V"));
        w.setOnClickListener(v -> keyboard("W"));
        x.setOnClickListener(v -> keyboard("X"));
        y.setOnClickListener(v -> keyboard("Y"));
        z.setOnClickListener(v -> keyboard("Z"));

    }

    public void keyboard(String a) {
        
    }
}