package com.example.aturkuy;

public class Tugas {

    private int gambar;
    private String nama;
    private String deadline;
    private String urgensi;

    public Tugas(int gambar, String nama, String deadline, String urgensi) {
        this.gambar= gambar;
        this.nama = nama;
        this.deadline = deadline;
        this.urgensi = urgensi;
    }

    public int getPreview() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getUrgensi() {
        return urgensi;
    }

    public void setUrgensi(String urgensi) {
        this.urgensi = urgensi;
    }
}