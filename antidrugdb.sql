-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2016 at 01:23 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `antidrugdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `alertmeeting`
--

CREATE TABLE `alertmeeting` (
  `alertID` int(5) NOT NULL,
  `alertDate` date NOT NULL,
  `alertTitle` varchar(50) NOT NULL,
  `alertDetail` text NOT NULL,
  `alertReport` text NOT NULL,
  `alertByStaff` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `alertmeeting`
--

INSERT INTO `alertmeeting` (`alertID`, `alertDate`, `alertTitle`, `alertDetail`, `alertReport`, `alertByStaff`) VALUES
(30001, '2016-04-29', 'Meet Bro Suchart', 'Meet Bro Suchart at coffee shop in Pattani', '-มีการปรับพฤติกรรมการใช้ชีวิต\r\n-ลดการใช้สารเสพติด', 'Ayouzainy');

-- --------------------------------------------------------

--
-- Table structure for table `evaluate`
--

CREATE TABLE `evaluate` (
  `evaluateID` int(5) NOT NULL,
  `patientIDCard` varchar(15) NOT NULL,
  `patientName` varchar(50) NOT NULL,
  `patientLastname` varchar(50) NOT NULL,
  `patientAge` int(3) NOT NULL,
  `patientAddress` text NOT NULL,
  `evaluatePoint` int(5) NOT NULL,
  `drugType` varchar(100) NOT NULL,
  `evaluateResult` varchar(30) NOT NULL,
  `evaluateDate` date NOT NULL,
  `evaluateByStaff` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `evaluate`
--

INSERT INTO `evaluate` (`evaluateID`, `patientIDCard`, `patientName`, `patientLastname`, `patientAge`, `patientAddress`, `evaluatePoint`, `drugType`, `evaluateResult`, `evaluateDate`, `evaluateByStaff`) VALUES
(20001, '1539900204628', 'Suchart', 'Numsai', 25, 'Pattani', 35, 'DrugType1', 'medium', '2016-04-01', 'Nanny');

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `newsID` int(5) NOT NULL,
  `newsTitle` varchar(100) NOT NULL,
  `newsDetail` text NOT NULL,
  `newsDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`newsID`, `newsTitle`, `newsDetail`, `newsDate`) VALUES
(10001, 'กิจกรรมจิตอาสาสัมพันธ์ ', 'กิจกรรมจิตอาสาสัมพันธ์ ครั้งที่1 จังหวัดยะลา', '2016-04-17'),
(10002, 'อบรมอาชีพ ครั้งที่1', 'อบรมอาชีพ ครั้งที่1 จังหวัดปัตตานี\r\n', '2016-04-20');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staffID` int(5) NOT NULL,
  `staffName` varchar(20) NOT NULL,
  `staffLastname` varchar(20) NOT NULL,
  `staffAddress` text NOT NULL,
  `staffTel` int(13) NOT NULL,
  `staffUsername` varchar(20) NOT NULL,
  `staffPassword` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staffID`, `staffName`, `staffLastname`, `staffAddress`, `staffTel`, `staffUsername`, `staffPassword`) VALUES
(1, 'Patcharamai', 'Heamhongsa', 'Phuket,Thailand', 833140625, 'Fearn', 'fearn01'),
(2, 'Kansuda', 'Sridee', 'Phuket,Thailand', 852130245, 'Nanny', 'Nanny02'),
(3, 'Norayounee', 'Hajeealee', 'Narathiwat,Thailand', 862932904, 'Ayouzainy', 'ayou03');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alertmeeting`
--
ALTER TABLE `alertmeeting`
  ADD PRIMARY KEY (`alertID`);

--
-- Indexes for table `evaluate`
--
ALTER TABLE `evaluate`
  ADD PRIMARY KEY (`evaluateID`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`newsID`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staffID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
