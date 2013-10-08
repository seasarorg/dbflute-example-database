update MEMBER_SECURITY set LOGIN_PASSWORD = sha1(LOGIN_PASSWORD);
update MEMBER set UPDATE_USER = hex(aes_encrypt(UPDATE_USER, 'himitsu'));
