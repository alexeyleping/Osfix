create table products
(
    product_id     bigserial primary key
        constraint products_application_applicationid_fk
            references application (application_id),
    product_name    text    not null,
    product_weight  numeric not null,
    product_comment text
);