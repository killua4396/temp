package Project0;

public class NBody {
    public static double readRadius(String url){
        In in = new In(url);
        in.readInt();
        double secondItemInFile = in.readDouble();
        return secondItemInFile;
    }

    public static Planet[] readPlanets(String url){
        double xxP = 0,yyP=0,xxV=0,yyV=0,mass=0;
        String imgFileName="";
        In in = new In(url);
        int number = in.readInt();
        double Radius = in.readDouble();
        Planet[] allPlanets = new Planet[number];
        for(int i=0;i<number;i++){
            xxP = in.readDouble();
            yyP = in.readDouble();
            xxV = in.readDouble();
            yyV = in.readDouble();
            mass = in.readDouble();
            imgFileName = in.readString();
            imgFileName ="C:\\Users\\金志超的电脑\\Desktop\\学习\\学习笔记\\CS61B\\My-CS61B-HW\\proj0\\images\\" + imgFileName;
            Planet p = new Planet(xxP,yyP,xxV,yyV,mass,imgFileName);
            allPlanets[i] = p;
        }
        return allPlanets;
    }

    public static void main(String[] args) {
        In in = new In();
        String line = in.readLine();
        double T = Double.parseDouble(line);
        line= in.readLine();
        double dt = Double.parseDouble(line);
        line = in.readLine();
        String fileName = line;
        Planet[] allPlanets = readPlanets(fileName);
        double Radius = readRadius(fileName);
        //开始作画
        StdDraw.setScale(-(Radius/1.0E9),(Radius/1.0E9));
        StdDraw.clear();
//
        StdDraw.enableDoubleBuffering();
//        StdDraw.show();
        double time = 0;
        while(time<T){
            double[] xForces = new double[allPlanets.length];
            double[] yForces = new double[allPlanets.length];
            for(int i=0;i<allPlanets.length;i++){
                xForces[i] = allPlanets[i].calcNetForceExertedByX(allPlanets);
                yForces[i] = allPlanets[i].calcNetForceExertedByY(allPlanets);
            }
            for(int i=0;i<allPlanets.length;i++){
                allPlanets[i].update(dt,xForces[i],yForces[i]);
            }
            StdDraw.picture(0,0,"C:\\Users\\金志超的电脑\\Desktop\\学习\\学习笔记\\CS61B\\My-CS61B-HW\\proj0\\images\\starfield.jpg");
            for(int i=0;i<allPlanets.length;i++){
                allPlanets[i].draw();
            }
            StdDraw.show();
            StdDraw.pause(10);
            time+= dt;
        }
    }
}

/*
157788000.0
25000.0
C:\Users\金志超的电脑\Desktop\学习\学习笔记\CS61B\My-CS61B-HW\proj0\data\3body.txt
 */