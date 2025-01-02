-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 29 Ara 2024, 16:37:23
-- Sunucu sürümü: 10.4.32-MariaDB
-- PHP Sürümü: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `okul`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `bolum`
--

CREATE TABLE `bolum` (
  `id` int(11) NOT NULL,
  `ad` varchar(255) DEFAULT NULL,
  `kod` varchar(255) DEFAULT NULL,
  `lisans_tur` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_turkish_ci;

--
-- Tablo döküm verisi `bolum`
--

INSERT INTO `bolum` (`id`, `ad`, `kod`, `lisans_tur`) VALUES
(1, 'Bilgisayar Programcılığı', 'CP100', 'Ön Lisans'),
(3, 'Aşçılık', 'AS202', 'Ön Lisans'),
(5, 'Grafik Tasarım', 'GRF10', 'Ön Lisans'),
(6, 'Makine', 'MAK20', 'Ön Lisans'),
(7, 'Otomotiv Teknolojisi', 'OTO202', 'Ön Lisans'),
(8, 'Bilgisayar Mühendisliği', 'BİL103', 'Lisans'),
(9, 'İnşaatt Mühendisliği', 'İNS10', 'Lisans'),
(10, 'Elektrik Elektronik Mühendisliği', 'ELK22', 'Lisans'),
(11, 'Uçak Mühendisliği', 'UCK302', 'Lisans'),
(12, 'Mimarlık', 'MIM101', 'Lisans'),
(13, 'Bilgisayar Mühendisliği (İngilizce)', 'BİL104', 'Yüksek Lisans'),
(14, 'İnşaat Mühendisliği (İngilizce)', 'INS11', 'Yüksek Lisans'),
(15, 'Uçak Mühendisliği (İngilizce)', 'UCK302', 'Yüksek Lisans'),
(16, 'Ekonomi Ve Finans (İngilizce)', 'EKM101', 'Doktora'),
(17, 'Siyaset Bilimi Ve Uluslararası İlişkiler', 'SYS202', 'Doktora');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ders`
--

CREATE TABLE `ders` (
  `id` int(11) NOT NULL,
  `ad` varchar(255) DEFAULT NULL,
  `kod` varchar(255) DEFAULT NULL,
  `kredi` varchar(255) DEFAULT NULL,
  `bolum_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_turkish_ci;

--
-- Tablo döküm verisi `ders`
--

INSERT INTO `ders` (`id`, `ad`, `kod`, `kredi`, `bolum_id`) VALUES
(1, 'Programlama Temelleri', 'BLP100', '3', 1),
(12, 'Veri Tabanı Yönetim Sistemleri', 'BLP101', '3', 1),
(13, 'Gastronomiye Giriş', 'ALP110', '3', 3),
(14, 'Pişirme Yöntemleri', 'ALP111', '3', 3),
(15, 'Temel Grafik Tasarım', 'GRF120', '3', 5),
(16, 'Web Grafik Tasarım', 'GRF121', '3', 5),
(17, 'İmalat İşlemleri', 'MKN130', '3', 6),
(18, 'Malzeme Teknolojisi', 'MKN131', '3', 6),
(19, 'Güç Aktarma Organları', 'OLP140', '3', 7),
(20, 'Motor Termodinamiği', 'OLP141', '3', 7),
(21, 'Görsel Programlama', 'BLP102', '4', 8),
(22, 'Nesne Yönelimli Programlama', 'BLP103', '4', 8),
(23, 'Zemin Mekaniği', 'ILP150', '4', 9),
(24, 'Yapı Statiği', 'ILP151', '4', 9),
(25, 'Elektronik', 'ELP160', '4', 10),
(26, 'Devre Analizi', 'ELP161', '4', 10),
(27, 'Termodinamik', 'ULP170', '4', 11),
(28, 'Statik', 'ULP171', '4', 11),
(29, 'Mimari Anlatım Teknikleri', 'MLP180', '4', 12),
(30, 'Bilgisayar Destekli Tasarım', 'MLP181', '4', 12),
(31, 'Bilimsel Araştırma Teknikleri', 'BLY300', '5', 13),
(32, 'Bilimsel Araştırma', 'IYL310', '5', 14),
(33, 'Bireysel Araştırma Tekniği', 'UYL320', '5', 15),
(34, 'Doktora Tezi', 'EDK400', '6', 16),
(35, 'Doktora Tez', 'SDK410', '6', 17);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ogrenci`
--

CREATE TABLE `ogrenci` (
  `id` int(11) NOT NULL,
  `tc_no` varchar(255) DEFAULT NULL,
  `ad` varchar(255) DEFAULT NULL,
  `soyad` varchar(255) DEFAULT NULL,
  `cinsiyet` varchar(255) DEFAULT NULL,
  `dogum_tarihi` varchar(255) DEFAULT NULL,
  `telefon` varchar(255) DEFAULT NULL,
  `eposta` varchar(255) DEFAULT NULL,
  `adres` text DEFAULT NULL,
  `bolum_id` int(11) DEFAULT NULL,
  `parola` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_turkish_ci;

--
-- Tablo döküm verisi `ogrenci`
--

INSERT INTO `ogrenci` (`id`, `tc_no`, `ad`, `soyad`, `cinsiyet`, `dogum_tarihi`, `telefon`, `eposta`, `adres`, `bolum_id`, `parola`) VALUES
(1, '12345678911', 'Mehmet', 'Yurt', 'Erkek', '01.01.2000', '05455454545', 'mehmet@mail.com', 'Adana', 1, '12345678'),
(2, '5462789156854', 'Emre', 'Çelik', 'Erkek', '13.06.2004', '5554489325', 'emrecelil@gmail.com', 'İstanbul', 1, '12345'),
(3, '147258369', 'Mustafa Burak', 'Kaya', 'Erkek', '02.10.2003', '565465', '6466@mail.com', 'Aydın', 1, '12345'),
(4, '1122334455', 'Hüseyin Ozan', 'Bulut', 'Erkek', '10.06.2005', '45659987', 'ozan@mail.com', 'Çanakkale', 1, '12345'),
(5, '4142434445', 'Aslan', 'Kılıç', 'Erkek', '10.05.2001', '4126542231', 'aslan@mail.com', 'Samsun', 1, '12345');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ogretmen`
--

CREATE TABLE `ogretmen` (
  `id` int(11) NOT NULL,
  `tc_no` varchar(255) DEFAULT NULL,
  `ad` varchar(255) DEFAULT NULL,
  `soyad` varchar(255) DEFAULT NULL,
  `cinsiyet` varchar(255) DEFAULT NULL,
  `dogum_tarihi` varchar(255) DEFAULT NULL,
  `telefon` varchar(255) DEFAULT NULL,
  `eposta` varchar(255) DEFAULT NULL,
  `adres` text DEFAULT NULL,
  `bolum_id` int(11) DEFAULT NULL,
  `parola` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_turkish_ci;

--
-- Tablo döküm verisi `ogretmen`
--

INSERT INTO `ogretmen` (`id`, `tc_no`, `ad`, `soyad`, `cinsiyet`, `dogum_tarihi`, `telefon`, `eposta`, `adres`, `bolum_id`, `parola`) VALUES
(1, '12345678910', 'Ahmet', 'Balaban', 'Erkek', '01.01.1970', '0545545454', 'ahmet@mail.com', 'Adana', 1, '12345678'),
(2, '25252645678', 'Samet', 'Of', 'Erkek', '01.01.2024', '5152233674', 'samet@mail.com', 'Samsun', 3, '123456789'),
(3, '23644525878', 'Cemile', 'Kara', 'Kadın', '10.02.1970', '4142361212', 'cemile@mail.com', 'İstanbul', 5, '12345'),
(4, '12765124537', 'Aslı', 'Pamuk', 'Kadın', '21.05.1982', '2545695241', 'aslı@mail.com', 'İstanbul', 6, '12345'),
(5, '54213342122', 'Emrah', 'Çolak', 'Erkek', '17.12.1998', '4125478451', 'emrah@mail.com', 'İstanbul', 7, '12345'),
(6, '41425687454', 'Hüseyin', 'Yılmaz', 'Erkek', '10.10.1973', '2145684757', 'hüseyin@mail.com', 'İstanbul', 8, '12345'),
(7, '25154558784', 'Ceren', 'Deniz', 'Kadın', '12.04.1988', '2456784545', 'ceren@mail.com', 'İstanbul', 9, '12345'),
(8, '25241526447', 'Mert', 'Koca', 'Erkek', '06.09.1995', '2457845621', 'mert@mail.com', 'İstanbul', 1, '12345');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `puan`
--

CREATE TABLE `puan` (
  `id` int(11) NOT NULL,
  `ogrenci_id` int(11) DEFAULT NULL,
  `ders_id` int(11) DEFAULT NULL,
  `tur` varchar(255) DEFAULT NULL,
  `puan` int(11) DEFAULT NULL,
  `tarih` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_turkish_ci;

--
-- Tablo döküm verisi `puan`
--

INSERT INTO `puan` (`id`, `ogrenci_id`, `ders_id`, `tur`, `puan`, `tarih`) VALUES
(2, 1, 1, '5', 55, '12.15.2024'),
(4, 1, 12, '3', 35, '29.12.2024'),
(7, 1, 12, '3', 55, '13.13.2024');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `yonetici`
--

CREATE TABLE `yonetici` (
  `id` int(11) NOT NULL,
  `kullanici_adi` varchar(255) DEFAULT NULL,
  `parola` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_turkish_ci;

--
-- Tablo döküm verisi `yonetici`
--

INSERT INTO `yonetici` (`id`, `kullanici_adi`, `parola`) VALUES
(1, 'yonetici', '12345678'),
(2, 'yonetici', '12345678'),
(3, 'yonetici', '12345678'),
(4, 'yonetici', '12345678'),
(5, 'yonetici', '12345678'),
(6, 'yonetici', '12345678'),
(7, 'yonetici', '12345678'),
(8, 'yonetici', '12345678'),
(9, 'yonetici', '12345678'),
(10, 'yonetici', '12345678'),
(11, 'yonetici', '12345678'),
(12, 'yonetici', '12345678'),
(13, 'yonetici', '12345678'),
(14, 'yonetici', '12345678'),
(15, 'yonetici', '12345678'),
(16, 'yonetici', '12345678'),
(17, 'yonetici', '12345678'),
(18, 'yonetici', '12345678'),
(19, 'yonetici', '12345678'),
(20, 'yonetici', '12345678'),
(21, 'yonetici', '12345678'),
(22, 'yonetici', '12345678'),
(23, 'yonetici', '12345678'),
(24, 'yonetici', '12345678'),
(25, 'yonetici', '12345678'),
(26, 'yonetici', '12345678'),
(27, 'yonetici', '12345678'),
(28, 'yonetici', '12345678'),
(29, 'yonetici', '12345678'),
(30, 'yonetici', '12345678'),
(31, 'yonetici', '12345678'),
(32, 'yonetici', '12345678'),
(33, 'yonetici', '12345678'),
(34, 'yonetici', '12345678'),
(35, 'yonetici', '12345678'),
(36, 'yonetici', '12345678'),
(37, 'yonetici', '12345678'),
(38, 'yonetici', '12345678'),
(39, 'yonetici', '12345678'),
(40, 'yonetici', '12345678'),
(41, 'yonetici', '12345678'),
(42, 'yonetici', '12345678'),
(43, 'yonetici', '12345678'),
(44, 'yonetici', '12345678'),
(45, 'yonetici', '12345678'),
(46, 'yonetici', '12345678'),
(47, 'yonetici', '12345678'),
(48, 'yonetici', '12345678'),
(49, 'yonetici', '12345678'),
(50, 'yonetici', '12345678'),
(51, 'yonetici', '12345678'),
(52, 'yonetici', '12345678'),
(53, 'yonetici', '12345678'),
(54, 'yonetici', '12345678');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `bolum`
--
ALTER TABLE `bolum`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `ders`
--
ALTER TABLE `ders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bolum_id` (`bolum_id`);

--
-- Tablo için indeksler `ogrenci`
--
ALTER TABLE `ogrenci`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bolum_id` (`bolum_id`);

--
-- Tablo için indeksler `ogretmen`
--
ALTER TABLE `ogretmen`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bolum_id` (`bolum_id`);

--
-- Tablo için indeksler `puan`
--
ALTER TABLE `puan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ogrenci_id` (`ogrenci_id`),
  ADD KEY `ders_id` (`ders_id`);

--
-- Tablo için indeksler `yonetici`
--
ALTER TABLE `yonetici`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `bolum`
--
ALTER TABLE `bolum`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Tablo için AUTO_INCREMENT değeri `ders`
--
ALTER TABLE `ders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- Tablo için AUTO_INCREMENT değeri `ogrenci`
--
ALTER TABLE `ogrenci`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Tablo için AUTO_INCREMENT değeri `ogretmen`
--
ALTER TABLE `ogretmen`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Tablo için AUTO_INCREMENT değeri `puan`
--
ALTER TABLE `puan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Tablo için AUTO_INCREMENT değeri `yonetici`
--
ALTER TABLE `yonetici`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `ders`
--
ALTER TABLE `ders`
  ADD CONSTRAINT `ders_ibfk_1` FOREIGN KEY (`bolum_id`) REFERENCES `bolum` (`id`);

--
-- Tablo kısıtlamaları `ogrenci`
--
ALTER TABLE `ogrenci`
  ADD CONSTRAINT `ogrenci_ibfk_1` FOREIGN KEY (`bolum_id`) REFERENCES `bolum` (`id`);

--
-- Tablo kısıtlamaları `ogretmen`
--
ALTER TABLE `ogretmen`
  ADD CONSTRAINT `ogretmen_ibfk_1` FOREIGN KEY (`bolum_id`) REFERENCES `bolum` (`id`);

--
-- Tablo kısıtlamaları `puan`
--
ALTER TABLE `puan`
  ADD CONSTRAINT `puan_ibfk_1` FOREIGN KEY (`ogrenci_id`) REFERENCES `ogrenci` (`id`),
  ADD CONSTRAINT `puan_ibfk_2` FOREIGN KEY (`ders_id`) REFERENCES `ders` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
