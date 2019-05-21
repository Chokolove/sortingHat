-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-05-2019 a las 03:48:15
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pichangol`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_local`
--

CREATE TABLE `tb_local` (
  `id` int(11) NOT NULL,
  `admin_id` int(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `created_at` varchar(20) NOT NULL,
  `updated_at` varchar(20) NOT NULL,
  `deleted_at` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tb_local`
--

INSERT INTO `tb_local` (`id`, `admin_id`, `address`, `description`, `latitude`, `longitude`, `created_at`, `updated_at`, `deleted_at`) VALUES
(4, 1, 'Calle Berlin 312', 'Cancha1', -12.120972, -77.033017, '2019-05-20 17:45', '2019-05-20 17:45', NULL),
(5, 1, 'Av. Jose Larco 612', 'Cancha2', -12.124086, -77.029255, '2019-05-20 17:45', '2019-05-20 17:45', NULL),
(6, 1, 'Calle Cantuarias 305', 'Cancha3', -12.121476, -77.027133, '2019-05-20 17:45', '2019-05-20 17:45', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_local`
--
ALTER TABLE `tb_local`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_local`
--
ALTER TABLE `tb_local`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
