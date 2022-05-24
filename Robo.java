class Robo {
  private int bateria;
  
  Robo(int bateria){
    this.bateria = bateria;
  }

  public String baterFoto(){
    if (this.ischarged()){
      this.tirarBateria();
      return "Foto batida";
    }else{
      return "bateria insuficiente";
    }
  }
  
  public String andarFrente(){
    if (this.ischarged()){
      this.tirarBateria();
      return "Andou para frente";
    }else{
      return "bateria insuficiente";
    }
  }
  
  public String andarTras(){
    if (this.ischarged()){
      this.tirarBateria();
      return "Andou para tras";
    }else{
      return "bateria insuficiente";
    }
  }
  
  public String virar(double grau){
    if (this.ischarged()){
      this.tirarBateria();
      return "Virou "+grau;
    }else{
      return "bateria insuficiente";
    }
  }
  
  public int getBateria(){
    return this.bateria;
  }
  
  public boolean ischarged(){
    return this.bateria > 10 ? true : false;
  }

  public void tirarBateria(){
    this.bateria = this.bateria - 1;
  }
}
