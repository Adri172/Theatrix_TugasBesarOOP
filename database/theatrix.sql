-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2021 at 08:18 AM
-- Server version: 10.1.40-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `theatrix`
--

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `judul` varchar(50) NOT NULL,
  `sinopsis` text NOT NULL,
  `produser` text NOT NULL,
  `sutradara` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `film`
--

INSERT INTO `film` (`judul`, `sinopsis`, `produser`, `sutradara`) VALUES
('Avengers Endgame', 'Melanjutkan Avengers Infinity War, dimana kejadian setelah Thanos berhasil mendapatkan semua infinity stones dan memusnahkan 50% semua mahluk hidup di alam semesta. Akankah para Avengers berhasil mengalahkan Thanos?', 'Kevin Feige', 'Joe Russo, Anthony Russo'),
('Ayat Ayat Cinta', 'Ini adalah kisah cinta. Tapi bukan cuma sekadar kisah cinta yang biasa. Ini tentang bagaimana menghadapi turun-naiknya persoalan hidup dengan cara Islam. Fahri bin Abdillah adalah pelajar Indonesia yang berusaha menggapai gelar masternya di Al-Azhar. Berjibaku dengan panas-debu Mesir. Berkutat dengan berbagai macam target dan kesederhanaan hidup. Bertahan dengan menjadi penerjemah buku-buku agama. Semua target dijalani Fahri dengan penuh antusias kecuali satu: menikah.', 'Manoj Punjabi, Dhamoo Punjabi', 'Hanung Bramantyo'),
('Joker', 'Arthur Fleck, seorang badut pesta, hidup dalam keadaan sulit bersama ibunya yang sakit-sakitan. Karena orang-orang menganggapnya aneh, ia memutuskan untuk berubah menjadi jahat dan membuat kekacauan.', 'Todd Phillips, Bradley Cooper, Emma Tillinger Koskoff', 'Todd Phillips'),
('Knives Out', 'Harlan Thrombey (Christopher Plummer) adalah penulis novel misteri yang kaya raya. Di ulang tahunnya yang ke-85 ia tewas secara misterius. Keluarga Harlan yang datang berkumpul kini menjadi tersangka. Mereka dicurigai oleh Detektif terkenal Benoit Blanc (Daniel Craig) yang datang untuk menyelidiki insiden ini.', 'Rian Johnson, Ram Bergman', 'Rian Johnson'),
('Laskar Pelangi', 'Laskar Pelangi (2008) adalah sebuah film garapan sutradara Riri Riza yang dirilis pada 26 September 2008. Film Laskar Pelangi merupakan karya adaptasi dari buku Laskar Pelangi yang ditulis oleh Andrea Hirata', 'Mira Lesmana', 'Riri Riza'),
('Nanti Kita Cerita Tentang Hari Ini', 'Setiap keluarga punya rahasia. Angkasa, Aurora dan Awan adalah kakak beradik yang hidup dalam keluarga yang tampak bahagia. Setelah mengalami kegagalan besar pertamanya, Awan berkenalan dengan Kale, seorang cowok eksentrik yang memberikan Awan pengalaman hidup baru, tentang patah, bangun, jatuh, tumbuh, hilang dan semua ketakutan manusia pada umumnya.', 'Anggia Kharisma', 'Angga Dwimas Sasongko');

-- --------------------------------------------------------

--
-- Table structure for table `logged_in`
--

CREATE TABLE `logged_in` (
  `username` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `logged_in`
--

INSERT INTO `logged_in` (`username`) VALUES
('stevandel');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `film` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `theaterdua`
--

CREATE TABLE `theaterdua` (
  `Judul` varchar(50) NOT NULL,
  `Sinopsis` text NOT NULL,
  `Produser` text NOT NULL,
  `Sutradara` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `theaterdua`
--

INSERT INTO `theaterdua` (`Judul`, `Sinopsis`, `Produser`, `Sutradara`) VALUES
('Baby Driver', 'Doc memaksa Baby, pengemudi ahli-sewaan, untuk bergabung dalam aksi pencurian dan mengancam akan menyakiti pacarnya jika menolak. Tapi rencananya kacau - salah satu tim mereka ternyata adalah polisi.', 'Tim Bevan, Eric Fellner, Nira Park', 'Edgar Wright'),
('Hacksaw Ridge', 'Diangkat dari kisah nyata penerima Medali Kehormatan. Desmond Doss mendaftar sebagai petugas medis di tentara AS pada masa Perang Dunia II, namun ia menolak untuk memegang senjata ataupun membunuh.', 'Terry Benedict, Paul Currie, Bruce Davey, William D. Johnson, Bill Mechanic, Brian Oliver, David Permut', 'Mel Gibson'),
('Spiderman Far From Home', 'Peter Parker (Tom Holland) tengah mengunjungi Eropa untuk liburan panjang bersama temaan-temanya. Sayangnya , Parker tidak bisa dengan tenang menikmati liburannya, karena Nick Fury datang secara tiba-tiba di kamar hotelnya. Selama di Eropa pun Peter harus menghadapi banyak musuh mulai dari Hydro Man, Sandman dan Molten Man.', 'Kevin Feige, Amy Pascal', 'Jon Watts'),
('Star Wars The Rise Of Skywalker', 'Resistance yang selamat sekali lagi akan menghadapi First Order dalam sebuah saga final yang akan menentukan nasib mereka.', 'Kathleen Kennedy, J.J.Abrams, Michelle Rejwan', 'J.J.Abrams');

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `id_transaksi` varchar(10) NOT NULL,
  `username` varchar(30) NOT NULL,
  `film` varchar(50) NOT NULL,
  `pcs` int(5) NOT NULL,
  `harga` int(10) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(30) NOT NULL,
  `password` varchar(16) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `nama`, `gender`, `email`, `telp`) VALUES
('stevandel', '12345678', 'Stevan Del Arisandi', 'Male', 'stevandel@gmail.com', '+621234567890');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`judul`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`film`);

--
-- Indexes for table `theaterdua`
--
ALTER TABLE `theaterdua`
  ADD PRIMARY KEY (`Judul`);

--
-- Indexes for table `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
