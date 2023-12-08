<?php
include "koneksi.php";

// Proses penambahan pesan
if(isset($_POST['proses_tambah'])){
    $idPesan = isset($_POST['idPesan']) ? $_POST['idPesan'] : '';
    $idPenerima = isset($_POST['idPenerima']) ? $_POST['idPenerima'] : '';
    $idPengirim = isset($_POST['idPengirim']) ? $_POST['idPengirim'] : '';
    $judul = isset($_POST['Judul']) ? $_POST['Judul'] : '';
    $textPesan = isset($_POST['TextPesan']) ? $_POST['TextPesan'] : '';
    $waktuPesan = isset($_POST['WktPesan']) ? $_POST['WktPesan'] : '';

    mysqli_query($koneksi, "INSERT INTO pesan SET
    idPesan = '$idPesan',
    idPenerima = '$idPenerima',
    idPengirim = '$idPengirim',
    Judul = '$judul',
    TextPesan = '$textPesan',
    WktPesan = '$waktuPesan'");

    echo "Pesan berhasil ditambahkan";
}

