
INSERT INTO `roles` (`name`) VALUES ('admin'),('member');

INSERT INTO `users` (`username`, `password`, `role_id`) VALUES ('admin', '$2a$12$zhdazzXWhonTkQPY.jNDhuM6Fs9Nu/uopSyUQF0O/bwnhWt7CTPmO', 1),('anhth', '$2a$12$EDBGh4ak.Wu14BDw7kRugO8KcwsKplSv0n3znq702B4eiff8I1dyC', 2);

INSERT INTO `category` (`name`, `image`) VALUES ('Hài hước', NULL),('Hành động', NULL);

INSERT INTO `cast` (`name`, `description`, `image`) VALUES ('Russell Brand', 'Russell Brand', NULL),('Steve Carell', 'Steve Carell', NULL),('Jason Segel', 'Jason Segel', NULL);

INSERT INTO `director` (`name`, `description`, `image`) VALUES ('Chris Renaud', 'Chris Renaud', NULL),('Shawn Levy', 'Shawn Levy', NULL);

INSERT INTO `film` (`name`, `description`, `category_id`, `director_id`, `thumbnail`, `duration`, `url`, `view`, `update_at`, `create_at`) VALUES ('Despicable Me', 'Phim về Gru-một tên tội phạm khét tiếng và đám tay chân robot tí hon chuyên đi đánh cắp những biểu tượng nổi tiếng của thế giới. Thế nhưng tiếng xấu của Gru bị suy giảm bởi Vector - tên trộm trẻ tuổi đã đánh cắp kim tự tháp Ai Cập. Bởi vậy để lấy lại danh tiếng của mình, Gru đã nghĩ đến một kế hoạch có một không hai: đánh cắp mặt trăng.', 1, 1, 'img6.jpg', 95, 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4', 0, '2020-09-03 00:00:00', '2020-09-03 00:00:00');
INSERT INTO `film` (`name`, `description`, `category_id`, `director_id`, `thumbnail`, `duration`, `url`, `view`, `update_at`, `create_at`) VALUES ('Night At The Museum: Secret Of The Tomb', 'Anh chàng gác đêm Michael một lần nữa sẽ theo viện bảo tàng đến xứ sở hoa anh đào để công tác. Không quên mang theo những người bạn tí hon của mình, và đặc biệt là tấm bài vị thần kì quý giả của vua Ai Cập. Cùng những nhân vật sống dậy từ bảo tàng, Micheal bắt đầu một chuyến phiêu lưu đầy hài hước.', 2, 2, 'img2.jpg', 100, 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4', 0, '2020-09-02 00:00:00', '2020-09-02 00:00:00');
INSERT INTO `film` (`name`, `description`, `category_id`, `director_id`, `thumbnail`, `duration`, `url`, `view`, `update_at`, `create_at`) VALUES('Aquaman', 'Một người nửa nhân loại nửa Atlantis bước chân vào hành trình xác định xem mình có phải là vị vua xứng đáng của thế giới Atlantis.', 2, 2, 'img7.jpg', 120, 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4', 1, '2020-09-01 00:00:00', '2020-09-01 00:00:00');
INSERT INTO `film` (`name`, `description`, `category_id`, `director_id`, `thumbnail`, `duration`, `url`, `view`, `update_at`, `create_at`) VALUES('Constantine: City Of Demons', 'Một sai lầm tệ hại đã khiến con gái bạn thân của thợ săn quỷ Constatine bị hôn mê. Hai người bước vào hành trình đầy hiểm nguy để giành lại linh hồn cô bé.', 2, 2, 'img5.jpg', 90, 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4', 5, '2020-09-03 00:00:00', '2020-09-03 00:00:00');
INSERT INTO `film` (`name`, `description`, `category_id`, `director_id`, `thumbnail`, `duration`, `url`, `view`, `update_at`, `create_at`) VALUES('John Wick Chapter 3: Parabellum', 'Sau khi sát hại một thành viên của tổ chức sát thủ quốc tế, mạng của John Wick được treo giá 14 triệu USD, và một đạo quân săn tiền thưởng liền bám riết lấy anh.', 2, 1, 'img1.jpg', 110, 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4', 100, '2020-09-03 00:00:00', '2020-09-03 00:00:00');
INSERT INTO `film` (`name`, `description`, `category_id`, `director_id`, `thumbnail`, `duration`, `url`, `view`, `update_at`, `create_at`) VALUES('Gemini Man', 'Một sát thủ về hưu bị buộc phải chạy trốn và nhận ra anh phải đối đầu với địch thủ ghê gớm nhất - bản sao trẻ trung hơn của mình.', 2, 2, 'img2.jpg', 95, 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4', 200, '2020-09-01 00:00:00', '2020-09-01 00:00:00');
INSERT INTO `film` (`name`, `description`, `category_id`, `director_id`, `thumbnail`, `duration`, `url`, `view`, `update_at`, `create_at`) VALUES('Angel Has Fallen', 'Một nhân viên Mật vụ bị kết tội oan chạy đua với thời gian để cứu Tổng thống và đất nước khỏi hiểm họa trong lúc trốn tránh chính cơ quan của mình và FBI.', 2, 1, 'img3.jpg', 95, 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4', 150, '2020-09-02 00:00:00', '2020-09-02 00:00:00');
INSERT INTO `film` (`name`, `description`, `category_id`, `director_id`, `thumbnail`, `duration`, `url`, `view`, `update_at`, `create_at`) VALUES('Tomb Raider', 'Khi tìm kiếm manh mối về vụ mất tích của người cha là nhà thám hiểm, cô gái Lara thông minh và can đảm bước vào hành trình tìm kiếm lăng mộ mất tích mà cha cô đang bỏ dở.', 2, 1, 'img8.jpg', 100, 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4', 20, '2020-08-28 00:00:00', '2020-08-29 00:00:00');
INSERT INTO `film` (`name`, `description`, `category_id`, `director_id`, `thumbnail`, `duration`, `url`, `view`, `update_at`, `create_at`) VALUES('A Score To Settle', 'Bị chẩn đoán mắc bệnh hiểm nghèo, một cựu tội phạm cố gắng hàn gắn với con trai trong lúc lên kế hoạch trả thù băng đảng cũ.', 2, 1, 'img9.jpg', 110, 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4', 120, '2020-09-03 00:00:00', '2020-09-03 00:00:00');
INSERT INTO `film` (`name`, `description`, `category_id`, `director_id`, `thumbnail`, `duration`, `url`, `view`, `update_at`, `create_at`) VALUES('Fast & Furious: Hobbs & Shaw', 'Khi một kẻ vô chính phủ được cải tạo gien chiếm được một vũ khí sinh học nguy hiểm có thể làm thay đổi cả thế giới, một nhân viên hành pháp phải hợp lực cùng một kẻ ngoài vòng pháp luật để đánh bại hắn.', 2, 2, 'img10.jpg', 100, 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4', 120, '2020-09-03 00:00:00', '2020-09-03 00:00:00');


INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(1, 1);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(1, 2);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(1, 3);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(2, 1);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(2, 1);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(3, 1);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(3, 2);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(4, 3);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(5, 1);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(5, 2);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(6, 1);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(6, 2);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(7, 3);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(7, 2);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(8, 1);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(9, 1);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(9, 3);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(10, 2);
INSERT INTO `film_cast` (`film_id`, `cast_id`) VALUES(10, 3);
