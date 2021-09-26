package com.renan.servicos;

import com.google.gson.Gson;
import com.renan.modelo.Filme;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

@Path("filmes")
public class FilmesResources {

    @Context
    private UriInfo context;
    
    private static List<Filme> filmes;

    public FilmesResources() {
        filmes = new ArrayList<Filme>();
        filmes.add(new Filme(1L, "007: Operação skyfall",
            "Em 2007 - Operação skyfall, a lealdade de Bond é testada."
            + "Com a m16 sendo atacada.",
            "Acao", 145, ""));
    }

    @GET
    @Produces("application/json")
    public String getFilmes() {
        Gson gson = new Gson();
        return gson.toJson(filmes);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
