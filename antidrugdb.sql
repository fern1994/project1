-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2016 at 09:28 AM
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
  `meetingDate` date NOT NULL,
  `meetingTitle` varchar(50) CHARACTER SET utf32 NOT NULL,
  `meetingDetail` text CHARACTER SET utf32 NOT NULL,
  `meetingSummary` text CHARACTER SET utf32 NOT NULL,
  `meetingByStaff` varchar(50) CHARACTER SET utf32 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `alertmeeting`
--

INSERT INTO `alertmeeting` (`alertID`, `meetingDate`, `meetingTitle`, `meetingDetail`, `meetingSummary`, `meetingByStaff`) VALUES
(30001, '2016-04-29', 'นัดพี่สุชาติ', 'นัดพบปะ พูดคุย อาการและความคืบหน้าการรักษาด้วยตนเอง', 'พี่สุชาติมี่สุขภาพที่ดีขึ้น ลดขนาดการใช้สารได้พอประมาณ', 'Ayou');

-- --------------------------------------------------------

--
-- Table structure for table `evaluate`
--

CREATE TABLE `evaluate` (
  `evaluateID` int(5) NOT NULL,
  `patientIDCard` varchar(15) CHARACTER SET utf32 NOT NULL,
  `patientName` varchar(50) CHARACTER SET utf32 NOT NULL,
  `patientLastname` varchar(50) CHARACTER SET utf32 NOT NULL,
  `patientAge` int(3) NOT NULL,
  `patientAddress` text CHARACTER SET utf32 NOT NULL,
  `evaluatePoint` int(5) NOT NULL,
  `drugType` varchar(100) CHARACTER SET utf32 NOT NULL,
  `evaluateResult` varchar(30) CHARACTER SET utf32 NOT NULL,
  `evaluateDate` date NOT NULL,
  `evaluateByStaff` varchar(50) CHARACTER SET utf32 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `evaluate`
--

INSERT INTO `evaluate` (`evaluateID`, `patientIDCard`, `patientName`, `patientLastname`, `patientAge`, `patientAddress`, `evaluatePoint`, `drugType`, `evaluateResult`, `evaluateDate`, `evaluateByStaff`) VALUES
(20001, '1456622869347', 'สมศรี', 'ใจดี', 25, 'นราธิวาส', 35, 'morphine', 'medium', '2016-04-01', 'Nanny'),
(20002, '196335502347', 'สุชาติ', 'ใจตรง', 32, 'Yala', 85, 'ยาไอซ์', 'ร้ายแรง', '2016-05-03', 'Ayou'),
(20003, '1988533246579', 'Michel', 'Horan', 19, 'LA', 24, 'morphine', 'Low', '2016-05-08', 'Fearn');

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `newsID` int(5) NOT NULL,
  `newsTitile` varchar(100) NOT NULL,
  `newsDetails` text NOT NULL,
  `newsDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`newsID`, `newsTitile`, `newsDetails`, `newsDate`) VALUES
(10001, 'อบรมยาเสพติต ยะลา', 'ให้ความรู้ ร่วมกิจกรรมต้านยาเสพติด จ.ยะลา', '2016-05-16'),
(10002, 'Staff meeting at Pattani', 'meeting all at Pattani', '2016-05-22');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staffID` int(5) NOT NULL,
  `staffName` varchar(20) CHARACTER SET utf32 NOT NULL,
  `staffLastname` varchar(20) CHARACTER SET utf32 NOT NULL,
  `staffAddress` text CHARACTER SET utf32 NOT NULL,
  `staffTel` int(13) NOT NULL,
  `staffUsername` varchar(20) CHARACTER SET utf32 NOT NULL,
  `staffPassword` varchar(20) CHARACTER SET utf32 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staffID`, `staffName`, `staffLastname`, `staffAddress`, `staffTel`, `staffUsername`, `staffPassword`) VALUES
(1, 'พัชรมัย', 'เหมหงษา', 'ภูเก็ต', 833140625, 'Fearnn', 'fearn01'),
(2, 'Kansuda', 'Sridee', 'Phuket', 852130245, 'Nanny', 'Nanny02'),
(3, 'นอร์อายูณี', 'หะยีอาลี', 'Narathiwat', 862932904, 'Ayou', 'Ayou03'),
(4, 'Niall', 'Horan', 'London', 862222347, 'Nialla', 'niall04');

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
