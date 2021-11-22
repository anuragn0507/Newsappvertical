package com.example.newsappvertical;

import java.util.ArrayList;

public class NewsModel {
    private String totalResults,status;
    private ArrayList<ArticlesModel> articles;

    public ArrayList<ArticlesModel> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ArticlesModel> articles) {
        this.articles = articles;
    }

    public NewsModel(ArrayList<ArticlesModel> articles) {
        this.articles = articles;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NewsModel(String totalResults, String status) {
        this.totalResults = totalResults;
        this.status = status;
    }
}
