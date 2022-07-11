package com.example.filedemo.model;

import javax.persistence.*;

@Entity
@Table(name = "website")
public class Website {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    String website_name;
    long download_start_date_time = System.nanoTime();
    long download_end_date_time = System.nanoTime();
    long total_elapsed_time = download_end_date_time- download_start_date_time;
    String total_downloaded_kilobytes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//    constructors


    public Website() {
    }

    public Website(Long id, String website_name, long download_start_date_time, long download_end_date_time, long total_elapsed_time, String total_downloaded_kilobytes) {
        this.id = id;
        this.website_name = website_name;
        this.download_start_date_time = download_start_date_time;
        this.download_end_date_time = download_end_date_time;
        this.total_elapsed_time = total_elapsed_time;
        this.total_downloaded_kilobytes = total_downloaded_kilobytes;
    }

    public String getWebsite_name() {
        return website_name;
    }

    public void setWebsite_name(String website_name) {
        this.website_name = website_name;
    }

    public long getDownload_start_date_time() {
        return download_start_date_time;
    }

    public void setDownload_start_date_time(long download_start_date_time) {
        this.download_start_date_time = download_start_date_time;
    }

    public long getDownload_end_date_time() {
        return download_end_date_time;
    }

    public void setDownload_end_date_time(long download_end_date_time) {
        this.download_end_date_time = download_end_date_time;
    }

    public long getTotal_elapsed_time() {
        return total_elapsed_time;
    }

    public void setTotal_elapsed_time(long total_elapsed_time) {
        this.total_elapsed_time = total_elapsed_time;
    }

    public String getTotal_downloaded_kilobytes() {
        return total_downloaded_kilobytes;
    }

    public void setTotal_downloaded_kilobytes(String total_downloaded_kilobytes) {
        this.total_downloaded_kilobytes = total_downloaded_kilobytes;
    }
}