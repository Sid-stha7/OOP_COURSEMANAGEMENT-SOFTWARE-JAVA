-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 15, 2021 at 07:26 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `final_assesment`
--

-- --------------------------------------------------------

--
-- Table structure for table `record`
--

CREATE TABLE `record` (
  `id` int(11) NOT NULL,
  `Courses` varchar(255) NOT NULL DEFAULT '',
  `M1` varchar(255) NOT NULL,
  `M2` varchar(255) NOT NULL,
  `M3` varchar(255) NOT NULL,
  `M4` varchar(255) NOT NULL,
  `M5` varchar(255) NOT NULL,
  `M6` varchar(255) NOT NULL,
  `Level` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `record`
--

INSERT INTO `record` (`id`, `Courses`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `Level`) VALUES
(2, 'MBA', 'JAVA', 'JAVA', 'JAVA', 'JAVA', 'JAVA', 'JAVA', '4'),
(4, 'IIT', 'String Theory', 'Quantum Dynamics', 'Quantum Mechanics', 'Theory of Relativity', 'Tesla Calculus', 'Newton\'s Calculus', '5'),
(7, 'Deepson Sir', 'JAVA', 'JAVA', 'JAVA', 'JAVA', 'JAVA', 'JAVA', '5'),
(8, 'Program', 'Pyhton', 'Pyhton', 'python', 'python', 'python', 'python', '4'),
(11, 'sad', 'Module name', 'Module name', 'Module name', 'Module name', 'Module name', 'Module name', '4'),
(25, 'Math', 'Module name', 'Module name', 'Module name', 'Module name', 'Module name', 'Module name', '4');

-- --------------------------------------------------------

--
-- Table structure for table `record2`
--

CREATE TABLE `record2` (
  `id` int(255) NOT NULL,
  `tutor` varchar(255) NOT NULL,
  `Module_assigned` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `record2`
--

INSERT INTO `record2` (`id`, `tutor`, `Module_assigned`) VALUES
(4, 'Deepson Shrestha', 'JAVA'),
(6, ' Hemanga Gautam', 'Python'),
(18, 'Hiran Patel', 'JAVA2'),
(19, 'Name', 'Moduel');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `record`
--
ALTER TABLE `record`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `record2`
--
ALTER TABLE `record2`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `record`
--
ALTER TABLE `record`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `record2`
--
ALTER TABLE `record2`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
