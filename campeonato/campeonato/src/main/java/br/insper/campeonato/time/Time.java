package br.insper.campeonato.time;

public class Time {
 private String identificador;
 private String nome;
 private String estado;
 private String estadio;

 public Time(String identificador, String nome, String estado, String estadio) {
  this.identificador = identificador;
  this.nome = nome;
  this.estado = estado;
  this.estadio = estadio;
 }



 public String getIdentificador() {
  return identificador;
 }

 public void setIdentificador(String identificador) {
  this.identificador = identificador;
 }

 public String getNome() {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }

 public String getEstado() {
  return estado;
 }

 public void setEstado(String estado) {
  this.estado = estado;
 }

 public String getEstadio() {
  return estadio;
 }

 public void setEstadio(String estadio) {
  this.estadio = estadio;
 }

}
