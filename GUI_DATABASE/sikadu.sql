-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 02, 2020 at 04:37 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sikadu`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `id` int(10) NOT NULL,
  `NamaLengkap` varchar(20) NOT NULL,
  `TempatLahir` varchar(20) NOT NULL,
  `TglLahir` int(20) NOT NULL,
  `BlnLahir` int(20) NOT NULL,
  `ThnLahir` int(20) NOT NULL,
  `MataKuliah` varchar(20) NOT NULL,
  `Status` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`id`, `NamaLengkap`, `TempatLahir`, `TglLahir`, `BlnLahir`, `ThnLahir`, `MataKuliah`, `Status`, `Email`, `Password`) VALUES
(1, 'Izaaz Azaam Syahalam', 'Serang', 28, 1, 2000, 'PBO', 'Aktif', 'admin', 'admin'),
(2, 'Adlan', 'Cirebon', 12, 12, 1999, 'Web', 'Aktif', 'admin2', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `raport`
--

CREATE TABLE `raport` (
  `id` int(20) NOT NULL,
  `nim` varchar(20) DEFAULT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `matakuliah` varchar(20) DEFAULT NULL,
  `absen` int(20) DEFAULT NULL,
  `tugas` int(20) DEFAULT NULL,
  `uas` int(20) DEFAULT NULL,
  `uts` int(20) DEFAULT NULL,
  `nilai` int(20) DEFAULT NULL,
  `ketkalimat` varchar(20) DEFAULT NULL,
  `ket` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `raport`
--

INSERT INTO `raport` (`id`, `nim`, `nama`, `matakuliah`, `absen`, `tugas`, `uas`, `uts`, `nilai`, `ketkalimat`, `ket`) VALUES
(7, '386', 'Izaaz', 'Arsitektur', 14, 100, 100, 100, 100, 'Lulus', 'A');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `raport`
--
ALTER TABLE `raport`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dosen`
--
ALTER TABLE `dosen`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `raport`
--
ALTER TABLE `raport`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
