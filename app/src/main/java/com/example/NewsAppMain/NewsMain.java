package com.example.NewsAppMain;

import java.util.ArrayList;

public class NewsMain {

        private String status;
        private int totalResults;
        private ArrayList<InitilizationsMod> articles;

    public NewsMain(String status, int totalResults, ArrayList<InitilizationsMod> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<InitilizationsMod> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<InitilizationsMod> articles) {
        this.articles = articles;
    }
}
