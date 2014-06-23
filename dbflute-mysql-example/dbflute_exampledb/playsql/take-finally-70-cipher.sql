update MEMBER set UPDATE_USER = hex(aes_encrypt(UPDATE_USER, 'himitsu'));
update WHITE_GEARED_CIPHER set CIPHER_DATETIME = sha1(CIPHER_DATETIME);
