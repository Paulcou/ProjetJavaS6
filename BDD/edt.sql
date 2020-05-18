-- phpMyAdmin SQL Dump
-- version 4.9.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: May 18, 2020 at 10:02 AM
-- Server version: 5.7.26
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `edt`
--

-- --------------------------------------------------------

--
-- Table structure for table `cours`
--

CREATE TABLE `cours` (
  `ID` int(11) NOT NULL,
  `Nom` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cours`
--

INSERT INTO `cours` (`ID`, `Nom`) VALUES
(1, 'Mathématiques'),
(2, 'Physique'),
(3, 'Informatique'),
(4, 'Electronique'),
(5, 'Anglais'),
(6, 'Finance');

-- --------------------------------------------------------

--
-- Table structure for table `enseignant`
--

CREATE TABLE `enseignant` (
  `ID_Utilisateur` int(11) NOT NULL,
  `ID_Cours` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enseignant`
--

INSERT INTO `enseignant` (`ID_Utilisateur`, `ID_Cours`) VALUES
(7, 1),
(7, 2),
(8, 3),
(8, 4),
(9, 5),
(9, 6);

-- --------------------------------------------------------

--
-- Table structure for table `etudiant`
--

CREATE TABLE `etudiant` (
  `ID_Utilisateur` int(11) NOT NULL,
  `Numero` varchar(30) NOT NULL,
  `ID_Groupe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `etudiant`
--

INSERT INTO `etudiant` (`ID_Utilisateur`, `Numero`, `ID_Groupe`) VALUES
(10, '1', 1),
(11, '2', 1),
(12, '3', 4),
(13, '4', 4),
(14, '5', 7),
(15, '6', 7),
(16, '7', 10),
(17, '8', 10),
(18, '9', 2),
(19, '10', 2),
(20, '11', 5),
(21, '12', 8),
(22, '13', 11),
(23, '14', 3),
(24, '15', 6);

-- --------------------------------------------------------

--
-- Table structure for table `groupe`
--

CREATE TABLE `groupe` (
  `ID` int(11) NOT NULL,
  `Nom` text NOT NULL,
  `ID_Promotion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `groupe`
--

INSERT INTO `groupe` (`ID`, `Nom`, `ID_Promotion`) VALUES
(1, 'TD1', 3),
(2, 'TD2', 3),
(3, 'TD3', 3),
(4, 'TD1', 2),
(5, 'TD2', 2),
(6, 'TD3', 2),
(7, 'TD1', 1),
(8, 'TD2', 1),
(9, 'TD3', 1),
(10, 'TD1', 4),
(11, 'TD2', 4),
(12, 'TD3', 4);

-- --------------------------------------------------------

--
-- Table structure for table `promotion`
--

CREATE TABLE `promotion` (
  `ID` int(11) NOT NULL,
  `Nom` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `promotion`
--

INSERT INTO `promotion` (`ID`, `Nom`) VALUES
(1, '2022'),
(2, '2021'),
(3, '2020'),
(4, '2023');

-- --------------------------------------------------------

--
-- Table structure for table `salle`
--

CREATE TABLE `salle` (
  `ID` int(11) NOT NULL,
  `Nom` text NOT NULL,
  `Capacite` int(11) NOT NULL,
  `ID_Site` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salle`
--

INSERT INTO `salle` (`ID`, `Nom`, `Capacite`, `ID_Site`) VALUES
(1, 'S1', 30, 1),
(2, 'S2', 30, 1),
(3, 'A1', 150, 1),
(4, 'S3', 30, 2),
(5, 'S4', 30, 2),
(6, 'A2', 150, 3),
(7, 'A3', 150, 3),
(8, 'S5', 30, 4),
(9, 'S6', 30, 4),
(10, 'A4', 150, 4);

-- --------------------------------------------------------

--
-- Table structure for table `seance`
--

CREATE TABLE `seance` (
  `ID` int(11) NOT NULL,
  `Semaine` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Heure_Debut` time NOT NULL,
  `Heure_Fin` time NOT NULL,
  `Etat` int(11) NOT NULL,
  `ID_Cours` int(11) NOT NULL,
  `ID_Type` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seance`
--

INSERT INTO `seance` (`ID`, `Semaine`, `Date`, `Heure_Debut`, `Heure_Fin`, `Etat`, `ID_Cours`, `ID_Type`) VALUES
(1, 20, '2020-05-20', '08:30:00', '10:00:00', 0, 1, 3),
(2, 20, '2020-05-20', '10:15:00', '11:45:00', 0, 5, 1),
(3, 20, '2020-05-20', '12:00:00', '13:30:00', 0, 2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `seances_enseignants`
--

CREATE TABLE `seances_enseignants` (
  `ID_Seance` int(11) NOT NULL,
  `ID_Enseignant` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `seance_groupes`
--

CREATE TABLE `seance_groupes` (
  `ID_Seance` int(11) NOT NULL,
  `ID_Groupe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `seance_salles`
--

CREATE TABLE `seance_salles` (
  `ID_Seance` int(11) NOT NULL,
  `ID_Salle` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `site`
--

CREATE TABLE `site` (
  `ID` int(11) NOT NULL,
  `Nom` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `site`
--

INSERT INTO `site` (`ID`, `Nom`) VALUES
(1, 'E1'),
(2, 'E2'),
(3, 'E3'),
(4, 'E4');

-- --------------------------------------------------------

--
-- Table structure for table `type_cours`
--

CREATE TABLE `type_cours` (
  `ID` int(11) NOT NULL,
  `Nom` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `type_cours`
--

INSERT INTO `type_cours` (`ID`, `Nom`) VALUES
(1, 'TD'),
(2, 'TP'),
(3, 'Cours Magistral'),
(4, 'Projet'),
(5, 'soutien');

-- --------------------------------------------------------

--
-- Table structure for table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `ID` int(11) NOT NULL,
  `Email` text NOT NULL,
  `Passwd` text NOT NULL,
  `Nom` text NOT NULL,
  `Prenom` text NOT NULL,
  `Droit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `utilisateur`
--

INSERT INTO `utilisateur` (`ID`, `Email`, `Passwd`, `Nom`, `Prenom`, `Droit`) VALUES
(1, 'jules.lestrade@edu.ece.fr', 'Jules1', 'LESTRADE', 'Jules', 1),
(2, 'paul.coutiere@edu.ece.fr', 'Paul1', 'COUTIERE', 'Paul', 1),
(3, 'christine.jaubaut@edu.ece.fr', 'Christine1', 'JAUBAUT', 'Christine', 1),
(4, 'sebastien.draical@edu.ece.fr', 'Sebastien1', 'DRAICAL', 'Sebastien', 2),
(5, 'christophe.vandebeek@edu.ece.fr', 'Christophe1', 'VANDEBEEK', 'Christophe', 2),
(6, 'jean.luigio@edu.ece.fr', 'Jean1', 'LUIGIO', 'Jean', 2),
(7, 'dimitri.sarsesky@edu.ece.fr', 'Dimitri1', 'SARSESKY', 'Dimitri', 3),
(8, 'charlotte.pulici@edu.ece.fr', 'Charlotte1', 'PULICI', 'Charlotte', 3),
(9, 'elise.village@edu.ece.fr', 'Elise1', 'VILLAGE', 'Elise', 3),
(10, 'alice.piquetti@edu.ece.fr', 'Alice1', 'PIQUETTI', 'Alice', 4),
(11, 'adele.deliles@edu.ece.fr', 'Adele1', 'DELILES', 'Adele', 4),
(12, 'marie.solene@edu.ece.fr', 'Marie1', 'SOLENE', 'Marie', 4),
(13, 'bastien.deton@edu.ece.fr', 'Bastien1', 'DETON', 'Bastien', 4),
(14, 'victor.stancol@edu.ece.fr', 'Vicor1', 'STANCOL', 'Victor', 4),
(15, 'hector.hitch@edu.ece.fr', 'Hector1', 'HITCH', 'Hector', 4),
(16, 'kirsty.maloma@edu.ece.fr', 'Kirsty1', 'Maloma', 'Kirsty', 4),
(17, 'camille.lucho@edu.ece.fr', 'Camille1', 'LUCHO', 'Camille', 4),
(18, 'clemence.coutille@edu.ece.fr', 'Clemence1', 'COUTILLE', 'Clemence', 4),
(19, 'clement.gartual@edu.ece.fr', 'Clement1', 'GARTUAL', 'Clement', 4),
(20, 'pierre.huang@edu.ece.fr', 'Pierre1', 'HUANG', 'Pierre', 4),
(21, 'thomas.santia@edu.ece.fr', 'Thomas1', 'SANTIA', 'Thomas', 4),
(22, 'megane.martense@edu.ece.fr', 'Megane1', 'MARTENSE', 'MEGANE', 4),
(23, 'jean.normand@edu.ece.fr', 'Jean1', 'NORMAND', 'Jean', 4),
(24, 'cesar.bonaparte@edu.ece.fr', 'Cesar1', 'BONAPARTE', 'Cesar', 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cours`
--
ALTER TABLE `cours`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `enseignant`
--
ALTER TABLE `enseignant`
  ADD PRIMARY KEY (`ID_Utilisateur`,`ID_Cours`),
  ADD KEY `ID_Cours` (`ID_Cours`);

--
-- Indexes for table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`ID_Utilisateur`),
  ADD KEY `ID_Groupe` (`ID_Groupe`);

--
-- Indexes for table `groupe`
--
ALTER TABLE `groupe`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_Promotion` (`ID_Promotion`);

--
-- Indexes for table `promotion`
--
ALTER TABLE `promotion`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_Site` (`ID_Site`);

--
-- Indexes for table `seance`
--
ALTER TABLE `seance`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_Cours` (`ID_Cours`),
  ADD KEY `ID_Type` (`ID_Type`);

--
-- Indexes for table `seances_enseignants`
--
ALTER TABLE `seances_enseignants`
  ADD PRIMARY KEY (`ID_Seance`,`ID_Enseignant`),
  ADD KEY `ID_Enseignant` (`ID_Enseignant`);

--
-- Indexes for table `seance_groupes`
--
ALTER TABLE `seance_groupes`
  ADD PRIMARY KEY (`ID_Seance`,`ID_Groupe`),
  ADD KEY `ID_Groupe` (`ID_Groupe`);

--
-- Indexes for table `seance_salles`
--
ALTER TABLE `seance_salles`
  ADD PRIMARY KEY (`ID_Seance`,`ID_Salle`),
  ADD KEY `ID_Salle` (`ID_Salle`);

--
-- Indexes for table `site`
--
ALTER TABLE `site`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `type_cours`
--
ALTER TABLE `type_cours`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cours`
--
ALTER TABLE `cours`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `groupe`
--
ALTER TABLE `groupe`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `promotion`
--
ALTER TABLE `promotion`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `salle`
--
ALTER TABLE `salle`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `seance`
--
ALTER TABLE `seance`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `site`
--
ALTER TABLE `site`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `type_cours`
--
ALTER TABLE `type_cours`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `enseignant`
--
ALTER TABLE `enseignant`
  ADD CONSTRAINT `enseignant_ibfk_1` FOREIGN KEY (`ID_Cours`) REFERENCES `cours` (`ID`),
  ADD CONSTRAINT `enseignant_ibfk_2` FOREIGN KEY (`ID_Utilisateur`) REFERENCES `utilisateur` (`ID`);

--
-- Constraints for table `etudiant`
--
ALTER TABLE `etudiant`
  ADD CONSTRAINT `etudiant_ibfk_1` FOREIGN KEY (`ID_Utilisateur`) REFERENCES `utilisateur` (`ID`),
  ADD CONSTRAINT `etudiant_ibfk_2` FOREIGN KEY (`ID_Groupe`) REFERENCES `groupe` (`ID`);

--
-- Constraints for table `groupe`
--
ALTER TABLE `groupe`
  ADD CONSTRAINT `groupe_ibfk_1` FOREIGN KEY (`ID_Promotion`) REFERENCES `promotion` (`ID`);

--
-- Constraints for table `salle`
--
ALTER TABLE `salle`
  ADD CONSTRAINT `salle_ibfk_1` FOREIGN KEY (`ID_Site`) REFERENCES `site` (`ID`);

--
-- Constraints for table `seance`
--
ALTER TABLE `seance`
  ADD CONSTRAINT `seance_ibfk_1` FOREIGN KEY (`ID_Cours`) REFERENCES `cours` (`ID`),
  ADD CONSTRAINT `seance_ibfk_2` FOREIGN KEY (`ID_Type`) REFERENCES `type_cours` (`ID`);

--
-- Constraints for table `seances_enseignants`
--
ALTER TABLE `seances_enseignants`
  ADD CONSTRAINT `seances_enseignants_ibfk_1` FOREIGN KEY (`ID_Enseignant`) REFERENCES `enseignant` (`ID_Utilisateur`),
  ADD CONSTRAINT `seances_enseignants_ibfk_2` FOREIGN KEY (`ID_Seance`) REFERENCES `seance` (`ID`);

--
-- Constraints for table `seance_groupes`
--
ALTER TABLE `seance_groupes`
  ADD CONSTRAINT `seance_groupes_ibfk_1` FOREIGN KEY (`ID_Groupe`) REFERENCES `groupe` (`ID`),
  ADD CONSTRAINT `seance_groupes_ibfk_2` FOREIGN KEY (`ID_Seance`) REFERENCES `seance` (`ID`);

--
-- Constraints for table `seance_salles`
--
ALTER TABLE `seance_salles`
  ADD CONSTRAINT `seance_salles_ibfk_1` FOREIGN KEY (`ID_Salle`) REFERENCES `salle` (`ID`),
  ADD CONSTRAINT `seance_salles_ibfk_2` FOREIGN KEY (`ID_Seance`) REFERENCES `seance` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
