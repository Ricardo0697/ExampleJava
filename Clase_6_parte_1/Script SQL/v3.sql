CREATE TABLE rol(
	id SERIAL PRIMARY KEY NOT NULL,
	nombre CHARACTER VARYING (100)
);

CREATE TABLE modulo(
	id SERIAL PRIMARY KEY NOT NULL,
	nombre CHARACTER VARYING (100)
);

CREATE TABLE permiso(
	id SERIAL PRIMARY KEY NOT NULL,
	id_rol INT NOT NULL, 
	id_modulo INT NOT NULL, 
	accion INT NOT NULL, 
	CONSTRAINT fk_permiso_rol FOREIGN KEY(id_rol) REFERENCES rol(id),
	CONSTRAINT fk_permiso_modulo FOREIGN KEY(id_modulo) REFERENCES modulo(id),
	UNIQUE (id_rol,id_modulo,accion)
);

CREATE TABLE permiso_usuario(
	id SERIAL PRIMARY KEY NOT NULL,
	id_permiso INT NOT NULL, 
	id_usuario INT NOT NULL, 
	CONSTRAINT fk_permiso_usuario_permiso FOREIGN KEY(id_permiso) REFERENCES permiso(id),
	CONSTRAINT fk_permiso_usuario_usuario FOREIGN KEY(id_usuario) REFERENCES usuario(id)
);

INSERT INTO usuario(nombre,clave) VALUES ('admin','12345');

INSERT INTO rol(nombre) VALUES ('Administrador');
INSERT INTO rol(nombre) VALUES ('Ventas');
INSERT INTO rol(nombre) VALUES ('Recursos Humanos');

INSERT INTO modulo(nombre) VALUES ('Cliente');
INSERT INTO modulo(nombre) VALUES ('Empleado');


INSERT INTO permiso(id_rol,id_modulo,accion) VALUES (1,1,1);
INSERT INTO permiso(id_rol,id_modulo,accion) VALUES (1,1,2);
INSERT INTO permiso(id_rol,id_modulo,accion) VALUES (1,1,3);
INSERT INTO permiso(id_rol,id_modulo,accion) VALUES (1,1,4);
INSERT INTO permiso(id_rol,id_modulo,accion) VALUES (1,2,1);
INSERT INTO permiso(id_rol,id_modulo,accion) VALUES (1,2,2);
INSERT INTO permiso(id_rol,id_modulo,accion) VALUES (1,2,3);
INSERT INTO permiso(id_rol,id_modulo,accion) VALUES (1,2,4);


INSERT INTO rol_usuario(id_rol,id_usuario) VALUES (1,4);


SELECT * 
FROM usuario usuario,
rol_usuario rol_usuario,
rol rol,
permiso permiso,
modulo modulo
WHERE 
usuario.id=rol_usuario.id_usuario
AND
rol_usuario.id_rol=rol.id
AND
rol.id=permiso.id_rol
AND
permiso.id_modulo=modulo.id
AND
usuario.id=4


