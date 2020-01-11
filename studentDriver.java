class studentDriver{
  
    private String name;
    private String emailAddress;
    private int Number;
    
  public studentDriver(String name, String emailAddress, int Number){
     
      this.name = name;
      this.emailAddress = emailAddress;
      this.Number = Number;     
    }
    
    public String getName(){
    return this.name;
    }
    public String getemailAddress(){
    return this.emailAddress;
    }
    public int studentNumber(){
    return this.Number;
    }
    
   public void setName(String name){
     this.name = name;
    } 
    public void setStudentNumber(int studentNumber){
    this.Number = Number;
    }
    
    

}