package WLVManagementSoftware;

public class StudentDetail {
    String fname,id,cname,mod1,mod2,mod3,mod4,mod5,mod6;
    String  m1,m2,m3,m4,m5,m6,grade,percentage,total;
    public StudentDetail(String fn,String id,String cname,
                         String mod1,String mod2,String mod3,String mod4,
                         String mod5,String mod6,String  m1,String m2,String m3,
                         String m4,String m5,String m6,String g,String p,String t
                         ){

        this.fname=fn;
        this.id=id;
        this.cname=cname;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
        this.m6=m6;
        this.mod1=mod1;
        this.mod2=mod2;
        this.mod3=mod3;
        this.mod4=mod4;
        this.mod5=mod5;
        this.mod6=mod6;
        this.total=t;
        this.percentage=p;
        this.grade=g;

    }


}
