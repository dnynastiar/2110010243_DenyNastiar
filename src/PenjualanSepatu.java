/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class PenjualanSepatu {
    
String merk,ukr,kode;
  int harga,qty,total,no;
  int ppn,grandtotal;
  int ukuran,subtotal=0;
 
public int getNo() {
  return no;
}
 
public void setNo(int no) {
  this.no = no;
}
 
public String getKode() {
 return kode;
}
 
public void setKode(String kode) {
  this.kode = kode;
}
 
public String getMerk() {
  return merk;
}
 
public void setMerk(String merk) {
  this.merk = merk;
}
 
public String getUkr() {
  return ukr;
}
 
public void setUkr(String ukr) {
  this.ukr = ukr;
}
 
public int getHarga() {
  return harga;
}
 
public void setHarga(int harga) {
  this.harga = harga;
}
 
public int getQty() {
  return qty;
}
 
public void setQty(int qty) {
  this.qty = qty;
}
 
public int getTotal() {
  return total;
}
 
public void setTotal(int total) {
  this.total = total;
}
public PenjualanSepatu(int no,String kode,String merk, String ukr, int harga, int qty, int total)
{
  this.no = no;
  this.kode = kode;
  this.merk = merk;
  this.ukr = ukr;
  this.harga = harga;
  this.qty = qty;
  this.total = total;
}
 
}
