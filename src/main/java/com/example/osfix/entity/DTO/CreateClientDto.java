package com.example.osfix.entity.DTO;

public class CreateClientDto {
        private Long id;
        private String name;
        private String website;
        private String comment;

        public CreateClientDto(Long id, String name, String website, String comment) {
            this.id = id;
            this.name = name;
            this.website = website;
            this.comment = comment;
        }

        public CreateClientDto(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

         public String getName() {
            return name;
        }

        public String getSite() {
            return website;
        }

        public String getComment() {
            return comment;
        }
}
