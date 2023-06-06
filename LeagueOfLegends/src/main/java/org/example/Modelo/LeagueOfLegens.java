package org.example.Modelo;


import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LeagueOfLegens {
        private int Id;
        private String plataforma;
        private String rolFavorito;
        private String personajeFavorito;
        private String rangoClasificatorio;
        private String url;


        public LeagueOfLegens() {
        }


        public LeagueOfLegens(int id, String plataforma, String rolFavorito, String personajeFavorito, String rangoClasificatorio, String url) {
            Id = id;
            this.plataforma = plataforma;
            this.rolFavorito = rolFavorito;
            this.personajeFavorito = personajeFavorito;
            this.rangoClasificatorio = rangoClasificatorio;
            this.url = url;
        }


        public int getId() {
            return Id;
        }


        public void setId(int id) {
            Id = id;
        }


        public String getPlataforma() {
            return plataforma;
        }


        public void setPlataforma(String plataforma) {
            this.plataforma = plataforma;
        }


        public String getRolFavorito() {
            return rolFavorito;
        }


        public void setRolFavorito(String rolFavorito) {
            this.rolFavorito = rolFavorito;
        }


        public String getPersonajeFavorito() {
            return personajeFavorito;
        }


        public void setPersonajeFavorito(String personajeFavorito) {
            this.personajeFavorito = personajeFavorito;
        }


        public String getRangoClasificatorio() {
            return rangoClasificatorio;
        }


        public void setRangoClasificatorio(String rangoClasificatorio) {
            this.rangoClasificatorio = rangoClasificatorio;
        }


        public String getUrl() {
            return url;
        }


        public void setUrl(String url) {
            this.url = url;
        }


        @Override
        public String toString() {
            return "LeagueOfLegens{" +
                    "Id=" + Id +
                    ", plataforma='" + plataforma + '\'' +
                    ", rolFavorito='" + rolFavorito + '\'' +
                    ", personajeFavorito='" + personajeFavorito + '\'' +
                    ", rangoClasificatorio='" + rangoClasificatorio + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    public ImageIcon createIcon(){
        ImageIcon resultado = null;

        try{
            URL urlImagen = new URL(this.url);
            resultado = new ImageIcon(urlImagen);
        }catch (MalformedURLException mue){
            System.out.println(mue.toString());
        }
        return resultado;
        }
    }
