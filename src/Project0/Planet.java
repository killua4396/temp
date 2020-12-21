package Project0;

public class Planet {
    public static  final double G = 6.67e-11;
    public double xxPos;//X的位置
    public double yyPos;//Y的位置
    public double xxVel;//X方向上的速度
    public double yyVel;//Y方向上的速度
    public double mass;
    public String imgFileName;

    //初始化星球
    public Planet(double xxPos, double yyPos, double xxVel, double yyVel, double mass, String imgFileName) {
        this.xxPos = xxPos;
        this.yyPos = yyPos;
        this.xxVel = xxVel;
        this.yyVel = yyVel;
        this.mass = mass;
        this.imgFileName = imgFileName;
    }

    //不带imgFileName的构造方法
    public Planet(double xxPos, double yyPos, double xxVel, double yyVel, double mass) {
        this.xxPos = xxPos;
        this.yyPos = yyPos;
        this.xxVel = xxVel;
        this.yyVel = yyVel;
        this.mass = mass;
        this.imgFileName = "";
    }

    //复制星球
    public Planet(Planet p){
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }

    //计算星球距离
    public double calcDistance(Planet p){
        double dx = this.xxPos-p.xxPos;
        double dy = this.yyPos-p.yyPos;
        double r = Math.sqrt(dx*dx+dy*dy);
        return r;
    }

    //计算星球引力
    public double calcForceExertedBy(Planet p){
        double r = this.calcDistance(p);
        double force = (G*this.mass*p.mass)/(r*r);
        return force;
    }

    //计算某星球对本星球X轴方向引力
    public double calcForceExertedByX(Planet p){
        double force = this.calcForceExertedBy(p);
        double r = this.calcDistance(p);
        double forceX = 0;
        if(p.xxPos!=this.xxPos){
            forceX = force*((p.xxPos-this.xxPos)/r);
        }
        return forceX;
    }

    //计算某星球对本星球Y轴方向引力
    public double calcForceExertedByY(Planet p){
        double force = this.calcForceExertedBy(p);
        double r = this.calcDistance(p);
        double forceY = 0;
        if(p.yyPos!=this.yyPos){
            forceY = force*((p.yyPos-this.yyPos)/r);
        }
        return forceY;
    }

    //本星球X轴方向上引力之和
    public double calcNetForceExertedByX(Planet[] allPlanet){
        double Sum_Force = 0;
        for(Planet p : allPlanet){
            Sum_Force += this.calcForceExertedByX(p);
        }
        return Sum_Force;
    }

    //本星球Y轴方向上引力之和
    public double calcNetForceExertedByY(Planet[] allPlanet){
        double Sum_Force = 0;
        for(Planet p : allPlanet){
            Sum_Force += this.calcForceExertedByY(p);
        }
        return Sum_Force;
    }

    public void update(double dt,double Fx,double Fy){
        double a_x = Fx/this.mass;
        double a_y = Fy/this.mass;
        this.xxVel = this.xxVel + dt * a_x;
        this.yyVel = this.yyVel + dt * a_y;
        this.xxPos = this.xxPos + dt * this.xxVel;
        this.yyPos = this.yyPos + dt * this.yyVel;
    }

    public void draw(){
        StdDraw.picture(xxPos/1.0E9,yyPos/1.0E9,imgFileName);
    }
}
