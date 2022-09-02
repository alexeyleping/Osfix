create table client
(
    client_id      bigserial primary key,
    client_name    text not null,
    web_site       text,
    client_comment text
);

create table application
(
    application_id     bigserial primary key,
    create_date        date not null,
    client_id          bigint references client (client_id),
    code_word          text,
    status_application text
);

create table products
(
    product_id      bigserial primary key,
    product_name    text    not null,
    product_weight  numeric not null,
    product_comment text
);

create table application_products
(
    application_id bigserial references application (application_id) not null,
    product_id     bigserial references products (product_id)        not null,
    constraint application_products_pkey
        primary key (application_id, product_id)
);