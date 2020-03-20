package com.ssasa.core.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Persona {

    @SerializedName("gentilicio")
    private String gentilicio;      //H
    @SerializedName("linguistica")
    private String linguistica;     //K
    @SerializedName("etnia")
    private String etnia;           //L
    @Expose
    private String xx;              //M

    @SerializedName("huellas")
    private ArrayList<Huella> huellas; //F

    @SerializedName("cui")
    private String cui;             //a
    @SerializedName("primerNombre")
    private String primerNombre;    //b
    @SerializedName("segundoNombre")
    private String segundoNombre;   //c
    @SerializedName("otrosNombres")
    private String otrosNombres;    //I
    @SerializedName("primerApellido")
    private String primerApellido;  //d
    @SerializedName("segundoApellido")
    private String segundoApellido; //e
    @SerializedName("apellidoCasada")
    private String apellidoCasada;  //f
    @SerializedName("genero")
    private String genero;          //g
    @SerializedName("municipioNacimiento")
    private String municipioNacimiento;     //h
    @SerializedName("departamentoNacimiento")
    private String departamentoNacimiento;  //i
    @SerializedName("paisNacimiento")
    private String paisNacimiento;          //j

    @SerializedName("nacimiento")
    private String nacimiento;      //k
    @SerializedName("emision")
    private String emision;         //l
    @SerializedName("vencimiento")
    private String vencimiento;     //m

    @SerializedName("estadoCivil")
    private String estadoCivil;     //n

    @SerializedName("municipioVecindad")
    private String municipioVecindad;       //o
    @SerializedName("departamentoVecindad")
    private String departamentoVecindad;    //p

    @SerializedName("nacionalidad")
    private String nacionalidad;            //q //GTM
    @SerializedName("sabeLeer")
    private String sabeLeer;                //r
    @SerializedName("sabeEscribir")
    private String sabeEscribir;            //s
    @SerializedName("limitacionesFisicas")
    private String limitacionesFisicas;     //t
    @SerializedName("libro")
    private String libro;       //u
    @SerializedName("folio")
    private String folio;       //v
    @SerializedName("partida")
    private String partida;     //w
    @SerializedName("profesion")
    private String profesion;   //x

    @SerializedName("numeroCedula")
    private String numeroCedula;        //y
    @SerializedName("municipioCedula")
    private String municipioCedula;     //z
    @SerializedName("departamentoCedula")
    private String departamentoCedula;  //A
    @SerializedName("oficialActivo")
    private String oficialActivo;       //B
    //@Expose
    //private byte[] fotografia;  //C
    @SerializedName("mrz2")
    private String mrz2;
    @SerializedName("serial")
    private String serial;      //E
    @SerializedName("direccion")
    private String direccion;
    @SerializedName("foto")
    private String foto;
    @SerializedName("versionDPI")
    private int versionDPI;
    @Expose
    String uriFoto;

    public Persona() {

        gentilicio = "";     //H
        linguistica = "";    //K
        etnia = "";          //L
        xx = "";             //M

        cui = "";            //a
        primerNombre = "";   //b
        segundoNombre = "";  //c
        otrosNombres = "";   //I
        primerApellido = ""; //d
        segundoApellido = "";//e
        apellidoCasada = ""; //f
        genero = "";         //g

        municipioNacimiento = "";    //h
        departamentoNacimiento = ""; //i
        paisNacimiento = "";         //j

        nacimiento = "";     //k
        emision = "";        //l
        vencimiento = "";    //m

        estadoCivil = "";    //n

        municipioVecindad = "";      //o
        departamentoVecindad = "";   //p

        nacionalidad = "";           //q //GTM

        sabeLeer = "";               //r
        sabeEscribir = "";           //s
        limitacionesFisicas = "";    //t

        libro = "";      //u
        folio = "";      //v
        partida = "";    //w
        profesion = "";  //x


        numeroCedula = "";       //y
        municipioCedula = "";    //z
        departamentoCedula = ""; //A
        oficialActivo = "";      //B
        mrz2 = "";       //D
        serial = "";     //E
        direccion = "";
    }

    public int getVersionDPI() {
        return versionDPI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getUriFoto() {
        return uriFoto;
    }

    public void setUriFoto(String uriFoto) {
        this.uriFoto = uriFoto;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getMunicipioCedula() {
        return municipioCedula;
    }

    public void setMunicipioCedula(String municipioCedula) {
        this.municipioCedula = municipioCedula;
    }

    public String getDepartamentoCedula() {
        return departamentoCedula;
    }

    public void setDepartamentoCedula(String departamentoCedula) {
        this.departamentoCedula = departamentoCedula;
    }

    public String getOtrosNombres() {
        return otrosNombres;
    }

    public void setOtrosNombres(String otrosNombres) {
        this.otrosNombres = otrosNombres;
    }

    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public String getLinguistica() {
        return linguistica;
    }

    public void setLinguistica(String linguistica) {
        this.linguistica = linguistica;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getApellidoCasada() {
        return apellidoCasada;
    }

    public void setApellidoCasada(String apellidoCasada) {
        this.apellidoCasada = apellidoCasada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMunicipioNacimiento() {
        return municipioNacimiento;
    }

    public void setMunicipioNacimiento(String municipioNacimiento) {
        this.municipioNacimiento = municipioNacimiento;
    }

    public String getDepartamentoNacimiento() {
        return departamentoNacimiento;
    }

    public void setDepartamentoNacimiento(String departamentoNacimiento) {
        this.departamentoNacimiento = departamentoNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getEmision() {
        return emision;
    }

    public void setEmision(String emision) {
        this.emision = emision;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getMunicipioVecindad() {
        return municipioVecindad;
    }

    public void setMunicipioVecindad(String municipioVecindad) {
        this.municipioVecindad = municipioVecindad;
    }

    public String getDepartamentoVecindad() {
        return departamentoVecindad;
    }

    public void setDepartamentoVecindad(String departamentoVecindad) {
        this.departamentoVecindad = departamentoVecindad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSabeLeer() {
        return sabeLeer;
    }

    public void setSabeLeer(String sabeLeer) {
        this.sabeLeer = sabeLeer;
    }

    public String getSabeEscribir() {
        return sabeEscribir;
    }

    public void setSabeEscribir(String sabeEscribir) {
        this.sabeEscribir = sabeEscribir;
    }

    public String getLimitacionesFisicas() {
        return limitacionesFisicas;
    }

    public void setLimitacionesFisicas(String limitacionesFisicas) {
        this.limitacionesFisicas = limitacionesFisicas;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getOficialActivo() {
        return oficialActivo;
    }

    public void setOficialActivo(String oficialActivo) {
        this.oficialActivo = oficialActivo;
    }

//    public byte[] getFotografia() {
//        return fotografia;
//    }
//
//    public void setFotografia(byte[] fotografia) {
//        this.fotografia = fotografia;
//    }

    public String getMrz2() {
        return mrz2;
    }

    public void setMrz2(String mrz2) {
        this.mrz2 = mrz2;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setVersionDPI(int versionDPI) {
        this.versionDPI = versionDPI;
    }

    public ArrayList<Huella> getHuellas() {
        return huellas;
    }

    public void setHuellas(ArrayList<Huella> huellas) {
        this.huellas = huellas;
    }
}
