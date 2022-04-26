package pages;

public class pruebaautomatizacionPage extends PageObject {

    private String pregunta_uno = "//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input";
    private String pregunta_dos = "//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input";
    private String pregunta_tres = "//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input";
    private String pregunta_cuatro = "//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/input";
    private String correo = "//*[@id=\"identifierId\"]";
    private String btn_siguiente = "//*[@id=\"identifierNext\"]/div/button";
    private String contrasena = "//*[@id=\"password\"]/div[1]/div/div[1]/input";
    private String btn_entrar = "//*[@id=\"passwordNext\"]/div/button";
    private String btn_enviar = "//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div";


    public pruebaautomatizacionPage() {
        super(driver);
    }

    //Ingresa a la aplicacion
    public void ingresarformulario(){
        navigate("https://docs.google.com/forms/d/e/1FAIpQLSe7SJKEb3i6S1V7BGwXYh16WwQbjJRkMivOfHFUkw6-Cg1sdA/viewform");

    }

    //llena el input del correo
    public void llenarinputinicio(String correo){
        writeElement(this.correo, correo);
    }

    //click en el boton siguiente
    public void clicsiguiente(){
        clickElement(btn_siguiente);
    }

    //llena el input de la contraseña
    public void llenarinputcontrasena(String contrasena){
        writeElement(this.contrasena, contrasena);
    }

    //click en el boton iniciar sesion
    public void cliciniciarsesion(){
        clickElement(btn_entrar);
    }

    //llena todos los inputs del formulario
    public void llenarInputspreguntas(String uno, String dos, String tres, String cuatro){
        writeElement(this.pregunta_uno, uno);
        writeElement(this.pregunta_dos, dos);
        writeElement(this.pregunta_tres, tres);
        writeElement(this.pregunta_cuatro, cuatro);

    }

    //click en el boton enviar
    public void clickEnviar(){
        clickElement(btn_enviar);
    }



}
